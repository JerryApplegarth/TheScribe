package com.applecompose.thescribe

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.applecompose.thescribe.data.NoteDataSource
import com.applecompose.thescribe.domain.model.Note
import com.applecompose.thescribe.domain.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
	private val repository: NoteRepository
): ViewModel() {


	private val _noteList = MutableStateFlow<List<Note>>(emptyList())
	val noteList = _noteList.asStateFlow()
	//var noteList = mutableStateListOf<Note>()

	init {
		//noteList.addAll(NoteDataSource().loadNotes())
		viewModelScope.launch(Dispatchers.IO) {
			repository.getAllNotes().distinctUntilChanged()
				.collect{ listOfNotes ->
					if (listOfNotes.isNullOrEmpty()) {
						Log.d("Empty", ":Empty List ")
					}else {
						_noteList.value = listOfNotes
					}

				}

		}
	}

	fun addNote(note: Note) = viewModelScope.launch {
		repository.addNote(note)
	}

	fun updateNote(note: Note) = viewModelScope.launch {
		repository.updateNote(note)
	}

	fun removeNote(note: Note) = viewModelScope.launch {
		repository.deleteNote(note)
	}



}
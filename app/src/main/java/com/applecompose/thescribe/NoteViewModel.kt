package com.applecompose.thescribe

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.applecompose.thescribe.data.NoteDataSource
import com.applecompose.thescribe.domain.model.Note

class NoteViewModel: ViewModel() {

	var noteList = mutableStateListOf<Note>()

	init {
		noteList.addAll(NoteDataSource().loadNotes())
	}

	fun addNote(note: Note) {
		noteList.add(note)
	}

	fun removeNote(note: Note) {
		noteList.remove(note)
	}
	fun getAllNotes(): List<Note> {
		return noteList
	}

}
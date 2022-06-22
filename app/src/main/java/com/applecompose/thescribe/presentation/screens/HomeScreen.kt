package com.applecompose.thescribe.presentation.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.applecompose.thescribe.NoteViewModel


@Composable
fun HomeScreen(noteViewModel: NoteViewModel = viewModel()) {
	val notesList = noteViewModel.getAllNotes()

	NoteScreen(notes = notesList,
		onAddNote = {
			noteViewModel.addNote(it)

		},
		onRemoveNote = {
			noteViewModel.removeNote(it)

		})

}








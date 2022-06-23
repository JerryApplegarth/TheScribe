package com.applecompose.thescribe.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.ExperimentalComposeUiApi
import com.applecompose.thescribe.NoteViewModel


@ExperimentalComposeUiApi
@Composable
fun HomeScreen(noteViewModel: NoteViewModel) {

	val notesList = noteViewModel.noteList.collectAsState().value

	NoteScreen(notes = notesList,
		onAddNote = {
			noteViewModel.addNote(it)

		},
		onRemoveNote = {
			noteViewModel.removeNote(it)

		}
	)

}








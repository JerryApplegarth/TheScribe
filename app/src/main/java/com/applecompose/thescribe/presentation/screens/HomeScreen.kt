package com.applecompose.thescribe.presentation.screens

import androidx.compose.runtime.Composable
import com.applecompose.thescribe.data.NoteDataSource

@Composable
fun HomeScreen() {
	NoteScreen(notes = NoteDataSource().loadNotes(),
		onAddNote = {},
		onRemoveNote = {})

}
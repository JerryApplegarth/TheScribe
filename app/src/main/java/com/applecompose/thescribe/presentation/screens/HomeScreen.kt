package com.applecompose.thescribe.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import com.applecompose.thescribe.domain.model.Note


@Composable
fun HomeScreen() {

	val notes = remember { mutableStateListOf<Note>()}

	NoteScreen(notes = notes,
		onAddNote = {
					notes.add(it)
		},
		onRemoveNote = {
			notes.remove(it)
		})

}
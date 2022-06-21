package com.applecompose.thescribe.presentation.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.applecompose.thescribe.R
import com.applecompose.thescribe.data.NoteDataSource
import com.applecompose.thescribe.domain.model.Note
import com.applecompose.thescribe.presentation.components.NoteButton
import com.applecompose.thescribe.presentation.components.NoteInputText
import com.applecompose.thescribe.presentation.components.NoteRow
import com.applecompose.thescribe.presentation.components.TopApp
import com.applecompose.thescribe.ui.theme.TheScribeTheme
import com.applecompose.thescribe.ui.theme.newBackgroundColor

@Composable
fun NoteScreen(
	notes: List<Note>,
	onAddNote: (Note) -> Unit,
	onRemoveNote: (Note) -> Unit,
) {
	var title by remember { mutableStateOf("") }
	var description by remember { mutableStateOf("") }

	val context = LocalContext.current

	Column(
		modifier = Modifier
			.padding(6.dp)
	) {

		TopApp()
		// Content goes here
		Column(
			modifier = Modifier
				.fillMaxWidth(),
			horizontalAlignment = Alignment.CenterHorizontally
		) {
			Spacer(modifier = Modifier.height(6.dp))
			NoteInputText(
				modifier = Modifier
					.padding(top = 8.dp, bottom = 8.dp),
				text = title,
				label = stringResource(R.string.title),
				onTextChange = {
					if (it.all { char ->
							char.isLetter() || char.isWhitespace()
						}) title = it
				})
			Spacer(modifier = Modifier.height(6.dp))
			NoteInputText(
				modifier = Modifier
					.padding(top = 8.dp, bottom = 8.dp),
				text = description,
				label = stringResource(R.string.add_a_note),
				onTextChange = { description = it },
				maxLine = 10
				)

			// Button goes here
			Spacer(modifier = Modifier.height(8.dp))
			NoteButton(
				modifier = Modifier
					.padding(top = 8.dp, bottom = 8.dp),
				text = stringResource(R.string.save),
				onClick = {
					if (title.isNotEmpty() && description.isNotEmpty()) {
						onAddNote(Note(
							title = title, description = description
						))
						title = ""
						description = ""
						Toast.makeText(
							context,
							"Note Saved",
							Toast.LENGTH_SHORT)
							.show()
					}
				})

		}
		Spacer(modifier = Modifier.height(8.dp))
		Divider(
			color = MaterialTheme.colors.primary,
			thickness = 2.dp
		)
		Spacer(modifier = Modifier.height(8.dp))
		LazyColumn {
			items(notes) { note ->
				NoteRow(
					note = note,
					onNoteClicked = {})
			}

		}
	}
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NoteScreenPreview() {
	TheScribeTheme {
		// A surface container using the 'background' color from the theme
		Surface(
			modifier = Modifier.fillMaxSize(),
			color = MaterialTheme.colors.newBackgroundColor
		) {
			NoteScreen(
				notes = NoteDataSource().loadNotes(),
				onAddNote = {},
				onRemoveNote = {})

		}
	}
}
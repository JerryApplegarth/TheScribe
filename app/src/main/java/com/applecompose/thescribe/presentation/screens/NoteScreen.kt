package com.applecompose.thescribe.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.applecompose.thescribe.presentation.components.NoteInputText
import com.applecompose.thescribe.presentation.components.TopApp
import com.applecompose.thescribe.ui.theme.TheScribeTheme
import com.applecompose.thescribe.ui.theme.newBackgroundColor

@Composable
fun NoteScreen() {
	val title by remember { mutableStateOf("")}
	val description by remember { mutableStateOf("")}
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
				text = title,
				label = "Title",
				onTextChange = {})
			Spacer(modifier = Modifier.height(6.dp))
			NoteInputText(
				text = description,
				label = "Add a Note",
				onTextChange = {})


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
			NoteScreen()

		}
	}
}
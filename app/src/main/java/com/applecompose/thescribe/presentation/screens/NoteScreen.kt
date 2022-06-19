package com.applecompose.thescribe.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.applecompose.thescribe.R
import com.applecompose.thescribe.presentation.components.TopApp
import com.applecompose.thescribe.ui.theme.TheScribeTheme
import com.applecompose.thescribe.ui.theme.newBackgroundColor

@Composable
fun NoteScreen() {
	Column(
		modifier = Modifier
			.padding(6.dp)
	) {
		TopApp()
		// Content goes here




		
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
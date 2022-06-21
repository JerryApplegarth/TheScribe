package com.applecompose.thescribe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.applecompose.thescribe.presentation.screens.HomeScreen
import com.applecompose.thescribe.ui.theme.TheScribeTheme
import com.applecompose.thescribe.ui.theme.newBackgroundColor
import com.applecompose.thescribe.ui.theme.newLightBackgroundColor

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			TheScribeTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colors.newLightBackgroundColor
				) {
					HomeScreen()

				}
			}
		}
	}
}


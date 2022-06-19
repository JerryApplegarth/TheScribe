package com.applecompose.thescribe.presentation.components

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Note
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.applecompose.thescribe.R

@Composable
fun TopApp() {
	androidx.compose.material.TopAppBar {
		Text(
			text = stringResource(id = R.string.app_name),
			fontSize = 24.sp,
			modifier = Modifier
				.weight(0.3f)
			)
		Icon(
			imageVector = Icons.Default.Note,
			contentDescription = "note pad",
			modifier = Modifier
				.weight(0.1f)
			)

	}
	// Content




}
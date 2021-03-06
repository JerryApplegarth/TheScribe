package com.applecompose.thescribe.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.applecompose.thescribe.domain.model.Note
import com.applecompose.thescribe.domain.utils.formatDate
import com.applecompose.thescribe.ui.theme.cardBackground
import com.applecompose.thescribe.ui.theme.mediumGreen
import com.applecompose.thescribe.ui.theme.newBackgroundColor
import java.time.format.DateTimeFormatter

@Composable
fun NoteRow(
	modifier: Modifier = Modifier,
	note: Note,
	onNoteClicked: (Note) -> Unit
) {
	Surface(
		modifier
			.padding(4.dp)
			.fillMaxWidth(),


		color = MaterialTheme.colors.newBackgroundColor,
		elevation = 6.dp,
		border = BorderStroke(2.dp, color = MaterialTheme.colors.mediumGreen)

	) {
		Column(
			modifier

				.padding(horizontal = 14.dp, vertical = 6.dp),
			horizontalAlignment = Alignment.Start
		) {
			Text(
				text = note.title,
				style = MaterialTheme.typography.subtitle2
			)
			Text(
				text = note.description,
				style = MaterialTheme.typography.subtitle1
			)
			Text(
				text = formatDate(note.entryDate.time),
				style = MaterialTheme.typography.caption
			)
			Icon(
				imageVector = Icons.Rounded.Delete,
				contentDescription = "delete icon",
				modifier = Modifier
					.clickable {
						onNoteClicked(note)
					}
					.align(Alignment.End)
			)

		}

	}

}

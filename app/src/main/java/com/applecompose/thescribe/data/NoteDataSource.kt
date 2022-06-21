package com.applecompose.thescribe.data

import com.applecompose.thescribe.domain.model.Note
import java.util.*

class NoteDataSource {

	fun loadNotes(): List<Note> {
		return listOf(
			Note(title =  "My First Note", description = "This is my first note"),
			Note(title = "My Second Note", description = "This is my second note"),
			Note(title = "My Third Note", description = "This is my third note"),
			Note(title = "My Fourth Note", description = "This is my fourth note"),
			Note(title = "My Fifth Note", description = "This is my fifth note"),
			Note(title = "My Sixth Note", description = "This is my sixth note"),
			Note(title = "My Seventh Note", description = "This is my seventh note"),
		)

	}
}
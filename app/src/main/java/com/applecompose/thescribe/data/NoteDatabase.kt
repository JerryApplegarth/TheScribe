package com.applecompose.thescribe.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.applecompose.thescribe.domain.model.Note
import com.applecompose.thescribe.domain.utils.DateConverter
import com.applecompose.thescribe.domain.utils.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase: RoomDatabase() {

	abstract fun noteDao(): NoteDatabaseDao
}
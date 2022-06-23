package com.applecompose.thescribe.domain.utils

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.core.graphics.ColorUtils
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

@SuppressLint("SimpleDateFormat")
fun formatDate(time: Long): String {
	val date = Date(time)
	val format = SimpleDateFormat("EEE, d MMM hh:mm aaa",
	Locale.getDefault()
		)
	return format.format(date)
}
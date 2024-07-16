package com.Amos.BankingApp.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class Notification(
    val icon : ImageVector,
    val title : String,
    val color : Color,
    val detail : String,
)
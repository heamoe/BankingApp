package com.Amos.BankingApp.data

import androidx.compose.ui.graphics.vector.ImageVector

data class TransactionDetail(
    val name : String,
    val type : Boolean,
    val amount : Double,
    val source : String,
    val icon : ImageVector
)


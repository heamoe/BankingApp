package com.Amos.BankingApp.Navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.Amos.BankingApp.WalletCompoent.AvailableBalanceSection
import com.Amos.BankingApp.WalletCompoent.TransactionDetailSection

@Composable
fun WalletScreen() {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            AvailableBalanceSection()
            TransactionDetailSection()


    }
}

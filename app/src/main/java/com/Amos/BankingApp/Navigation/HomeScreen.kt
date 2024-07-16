package com.Amos.BankingApp.Navigation

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.Amos.BankingApp.HomeCompoent.CardSection
import com.Amos.BankingApp.HomeCompoent.CurrenciesSection
import com.Amos.BankingApp.HomeCompoent.FinanceSection
import com.Amos.BankingApp.HomeCompoent.WalletSection

@Composable
fun HomeScreen() {

        Log.i("mytag","HomeScreen")
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            WalletSection()
            CardSection()
            Spacer(modifier = Modifier.height(16.dp))
            FinanceSection()
            CurrenciesSection()
        }


    }

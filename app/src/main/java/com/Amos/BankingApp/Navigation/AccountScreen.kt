package com.Amos.BankingApp.Navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.Amos.BankingApp.AccountCompoent.AvatarSection
import com.Amos.BankingApp.AccountCompoent.SettingSection
import com.Amos.BankingApp.ui.theme.spacer

@Composable
fun AccountScreen() {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            AvatarSection()
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(spacer)
            )
            SettingSection()
        }

}
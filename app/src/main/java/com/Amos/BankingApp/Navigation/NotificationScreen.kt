package com.Amos.BankingApp.Navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.Amos.BankingApp.NotificationCompoent.NotificationBar
import com.Amos.BankingApp.NotificationCompoent.NotificationSection
import com.Amos.BankingApp.ui.theme.spacer

@Composable
fun NotificationScreen() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = Color.White,
                modifier = Modifier.clip(CircleShape)

            ) {
                Icon(
                    imageVector = Icons.Default.Chat,
                    contentDescription = "Add"
                )
            }
        },
        floatingActionButtonPosition = FabPosition.End,

    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = padding.calculateTopPadding())
        ) {
            NotificationBar()
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(spacer)
            )
            NotificationSection()

        }

    }
}
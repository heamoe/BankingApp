package com.Amos.BankingApp.AccountCompoent

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Help
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.PrivacyTip
import androidx.compose.material.icons.outlined.Security
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Amos.BankingApp.data.Setting
import com.Amos.BankingApp.ui.theme.BlueEnd
import com.Amos.BankingApp.ui.theme.BlueStart
import com.Amos.BankingApp.ui.theme.Help
import com.Amos.BankingApp.ui.theme.Logout
import com.Amos.BankingApp.ui.theme.Notifications
import com.Amos.BankingApp.ui.theme.OrangeStart
import com.Amos.BankingApp.ui.theme.Privacy
import com.Amos.BankingApp.ui.theme.PurpleStart
import com.Amos.BankingApp.ui.theme.Security
import com.Amos.BankingApp.ui.theme.Settings
import com.Amos.BankingApp.ui.theme.spacer


@Preview
@Composable
fun SettingSection(){
    val settings = listOf(
        Setting(
            imageVector = Icons.Outlined.Security,
            name = "Security",
            color = Security
        ),
        Setting(
            imageVector = Icons.Outlined.Notifications,
            name = "Notifications",
            color = Notifications
        ),
        Setting(
            imageVector = Icons.Outlined.PrivacyTip,
            name = "Privacy",
            color = Privacy
        ),
        Setting(
            imageVector = Icons.Outlined.Help,
            name = "Help & Support",
            color = Help
        ),
        Setting(
            imageVector = Icons.Outlined.Settings,
            name = "Settings",
            color = Settings
        ),
        Setting(
            imageVector = Icons.Outlined.ExitToApp,
            name = "Logout",
            color = Logout
        )
    )
    LazyColumn {
        items(settings.size){
            Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                Row(modifier = Modifier
                    .clickable { }
                ) {
                    Icon(imageVector = settings[it].imageVector, contentDescription = settings[it].name,tint = settings[it].color)
                    Spacer(modifier = Modifier.width(16.dp))
                    Column(
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = settings[it].name,
                            fontSize = 15.sp
                        )
                        Text(
                            text = settings[it].name,
                            fontWeight = FontWeight.Thin,
                            fontSize = 10.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier
                                .widthIn(max = 200.dp)
                        )
                    }
                }
                Icon(imageVector = Icons.Outlined.ChevronRight, contentDescription = "see more")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(spacer)
            )
        }
    }

}
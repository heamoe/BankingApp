package com.Amos.BankingApp.NotificationCompoent

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
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.material.icons.rounded.ReceiptLong
import androidx.compose.material.icons.rounded.SystemUpdate
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Amos.BankingApp.data.Notification
import com.Amos.BankingApp.ui.theme.BlueStart
import com.Amos.BankingApp.ui.theme.GreenStart
import com.Amos.BankingApp.ui.theme.OrangeStart
import com.Amos.BankingApp.ui.theme.PurpleStart
import com.Amos.BankingApp.ui.theme.spacer

@Preview
@Composable
fun NotificationSection(){
    val notifications = listOf(
        Notification(
            icon = Icons.Rounded.Wallet,
            title = "Transaction",
            color = OrangeStart,
            detail = "Mr.Green transfer you 600 USD at 16:00pm 7/6 2024"
        ),
        Notification(
            icon = Icons.Rounded.Wallet,
            title = "Transaction",
            color = GreenStart,
            detail = "Mr. Green transferred you 600 USD at 16:00pm 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.ReceiptLong,
            title = "Refund",
            color = OrangeStart,
            detail = "You received a refund of 300 USD at 14:30pm 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.SystemUpdate,
            title = "System Notification",
            color = BlueStart,
            detail = "Your bank app has been updated successfully at 10:00am 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.Wallet,
            title = "Transaction",
            color = PurpleStart,
            detail = "You transferred 200 USD to Mr. Smith at 09:45am 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.Wallet,
            title = "Transaction",
            color = GreenStart,
            detail = "Mrs. White transferred you 150 USD at 12:00pm 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.ReceiptLong,
            title = "Refund",
            color = OrangeStart,
            detail = "You received a refund of 50 USD at 11:30am 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.SystemUpdate,
            title = "System Notification",
            color = BlueStart,
            detail = "Scheduled maintenance will occur at 03:00am 7/7 2024"
        ),

        Notification(
            icon = Icons.Rounded.Wallet,
            title = "Transaction",
            color = PurpleStart,
            detail = "You transferred 500 USD to Ms. Johnson at 18:30pm 7/6 2024"
        ),
        Notification(
            icon = Icons.Rounded.Wallet,
            title = "Transaction",
            color = PurpleStart,
            detail = "You transferred 200 USD to Mr. Smith at 09:45am 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.Wallet,
            title = "Transaction",
            color = GreenStart,
            detail = "Mrs. White transferred you 150 USD at 12:00pm 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.ReceiptLong,
            title = "Refund",
            color = OrangeStart,
            detail = "You received a refund of 50 USD at 11:30am 7/6 2024"
        ),

        Notification(
            icon = Icons.Rounded.SystemUpdate,
            title = "System Notification",
            color = BlueStart,
            detail = "Scheduled maintenance will occur at 03:00am 7/7 2024"
        )
    )

    LazyColumn {
        items(notifications.size){
            Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                Row(modifier = Modifier
                    .clickable { }
                ) {
                    Icon(imageVector = notifications[it].icon, contentDescription = notifications[it].title,tint = notifications[it].color)
                    Spacer(modifier = Modifier.width(16.dp))
                    Column(
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = notifications[it].title,
                            fontSize = 15.sp
                        )
                        Text(
                            text = notifications[it].detail,
                            fontWeight = FontWeight.Thin,
                            fontSize = 10.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier
                                .widthIn(max = 200.dp)
                        )
                    }
                }
                Box(modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
                    .background(MaterialTheme.colorScheme.secondaryContainer)
                ){
                    Icon(imageVector = Icons.Outlined.ArrowRight, contentDescription = "see more")
                }
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
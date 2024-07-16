package com.Amos.BankingApp.AccountCompoent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material.icons.outlined.QrCode
import androidx.compose.material.icons.outlined.Stars
import androidx.compose.material.icons.outlined.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Amos.BankingApp.R
import com.Amos.BankingApp.ui.theme.spacer

@Preview
@Composable
fun AvatarSection(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp),
       verticalAlignment = Alignment.CenterVertically
    ){
        Spacer(modifier = Modifier.width(16.dp))
        Box(modifier =Modifier.size(70.dp).clip(CircleShape).border(1.dp, Color.Black,CircleShape) ){
            Image(painter = painterResource(id = R.mipmap.ic_launcher_foreground) , contentDescription ="avatar")
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "Amos", fontWeight = FontWeight.Bold, fontSize = 25.sp)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = "Account Number")
                Spacer(modifier = Modifier.height(36.dp))
                Text(text = "7752668412",  fontSize = 15.sp)
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Row {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.QrCode, contentDescription = "personal QR code")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.ChevronRight, contentDescription = "more information")
            }
        }

    }
}
package com.Amos.BankingApp.AccountCompoent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Amos.BankingApp.R

@Preview
@Composable
fun Avatar(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(modifier =Modifier.clip(CircleShape) ){
            Image(painter = painterResource(id = R.mipmap.ic_launcher_foreground) , contentDescription ="avatar")
        }
    }
}
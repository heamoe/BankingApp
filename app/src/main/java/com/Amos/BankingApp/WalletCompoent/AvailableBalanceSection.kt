package com.Amos.BankingApp.WalletCompoent

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Amos.BankingApp.R
import com.Amos.BankingApp.ui.theme.Button1
import com.Amos.BankingApp.ui.theme.Button2
import com.Amos.BankingApp.ui.theme.boxBackground

@Preview
@Composable
fun AvailableBalanceSection(){
    var showBalance = remember {
        mutableStateOf(false)
    }

    var visibleIcon = remember {
        mutableStateOf(R.drawable.baseline_visibility_24)
    }

    var balance = remember {
        mutableStateOf("162,552.63")
    }

    Box(modifier = Modifier
        .padding(vertical = 12.dp, horizontal = 16.dp,)
        .border(
            width = 2.dp,
            color = MaterialTheme.colorScheme.primary,
            shape = MaterialTheme.shapes.small
        )
        .fillMaxWidth()
        .height(260.dp)
        .clickable { }
        ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)).background(boxBackground)
            ){
                Text(text = "Available Balance ($)")
                IconButton(
                    onClick = {
                        showBalance.value = !showBalance.value
                        if(showBalance.value){
                            visibleIcon.value = R.drawable.baseline_visibility_24
                            balance.value = "162,552.63"
                        }else{
                            visibleIcon.value = R.drawable.baseline_visibility_off_24
                            balance.value = "***,***.**"
                        }
                              },) {
                    Icon(
                        painter = painterResource(id = visibleIcon.value ),
                        contentDescription = "Balance visibility",
                        tint = Color.Unspecified
                    )
                }
            }
            Spacer(modifier = Modifier.height(35.dp))
            Text(text = balance.value, fontSize = 48.sp)
            Spacer(modifier = Modifier.height(45.dp))
            Row {
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Button1),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier.size(width = 150.dp, height = 50.dp)
                ) {
                    Text(text = "Deposit", fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Button2),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier.size(width = 150.dp, height = 50.dp)
                ) {
                    Text(text = "Withdrawal", fontSize = 20.sp)
                }
            }
        }
    }
}
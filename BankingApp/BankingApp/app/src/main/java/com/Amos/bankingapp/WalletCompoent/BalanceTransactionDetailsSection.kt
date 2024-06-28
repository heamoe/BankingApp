package com.Amos.bankingapp.WalletCompoent

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddBusiness
import androidx.compose.material.icons.rounded.FreeBreakfast
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ReceiptLong
import androidx.compose.material.icons.rounded.Train
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Amos.bankingapp.HomeCompoent.CurrencyItem
import com.Amos.bankingapp.HomeCompoent.currencies
import com.Amos.bankingapp.data.TransactionDetail
import com.Amos.bankingapp.ui.theme.GreenStart
import com.Amos.bankingapp.ui.theme.altBoxBackground
import com.Amos.bankingapp.ui.theme.boxBackground
import com.Amos.bankingapp.ui.theme.income
import com.Amos.bankingapp.ui.theme.outcome

val Details = listOf(

    TransactionDetail(
        "Grocery",
        false,
        25.34,
        "Walmart",
        Icons.Rounded.AddBusiness
    ),
    TransactionDetail(
        "Income",
        true,
        170.50,
        "Mr.Green",
        Icons.Rounded.Person
    ),
    TransactionDetail(
        "Refund",
        false,
        25.34,
        "AliExpress",
        Icons.Rounded.ReceiptLong
    ),
    TransactionDetail(
        "Transport",
        false,
        6.66,
        "TTC",
        Icons.Rounded.Train
    ),
    TransactionDetail(
        "Shopping",
        false,
        25.34,
        "Aliexpress",
        Icons.Rounded.AddBusiness
    ),
    TransactionDetail(
        "Food",
        false,
        27.50,
        "McDonald",
        Icons.Rounded.FreeBreakfast
    ),
    TransactionDetail(
        "Income",
        true,
        2000.50,
        "Mr.Green",
        Icons.Rounded.Person
    ),
)


@Preview
@Composable
fun  TransactionDetailSection(){
    Box(modifier = Modifier
        .padding(vertical = 12.dp, horizontal = 16.dp,)
        .clip(RoundedCornerShape(topEnd = 15.dp, topStart = 15.dp))
        .background(boxBackground)
        .fillMaxSize()
        ){
        Column {
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Type",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Amount",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "to/from",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxSize()
                    .background(altBoxBackground)
            ){
                Spacer(modifier = Modifier.height(16.dp))
                val boxWithConstraintScope = this
                val width = boxWithConstraintScope.maxWidth / 3
                LazyColumn(modifier = Modifier.padding(start = 9.dp, top = 9.dp)){
                    items(currencies.size){ index ->
                        DetailItem(
                            index = index,
                            width= width
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun DetailItem(index:Int,width : Dp){
    val detail = Details[index]
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier.width(width),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(GreenStart)
                    .padding(4.dp)
            ) {
                Icon(
                    imageVector = detail.icon,
                    contentDescription = detail.name,
                    modifier = Modifier.size(18.dp),
                    tint = Color.White
                )
            }

            Text(
                text = detail.name,
                modifier = Modifier.padding(start = 10.dp),
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        Text(
            text = "$ " + detail.amount.toString(),
            modifier = Modifier
                .width(width)
                .padding(start = 10.dp),
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = if (detail.type){ income}else{ outcome},
            textAlign = TextAlign.Center
        )
        Text(
            text = detail.source,
            modifier = Modifier
                .width(width)
                .padding(start = 10.dp),
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )
    }
}
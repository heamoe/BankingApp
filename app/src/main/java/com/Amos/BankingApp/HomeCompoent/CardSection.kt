package com.Amos.BankingApp.HomeCompoent



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Amos.BankingApp.R

import com.Amos.BankingApp.data.Card
import com.Amos.BankingApp.ui.theme.BlueEnd
import com.Amos.BankingApp.ui.theme.BlueStart
import com.Amos.BankingApp.ui.theme.GreenEnd
import com.Amos.BankingApp.ui.theme.GreenStart
import com.Amos.BankingApp.ui.theme.OrangeEnd
import com.Amos.BankingApp.ui.theme.OrangeStart
import com.Amos.BankingApp.ui.theme.PurpleEnd
import com.Amos.BankingApp.ui.theme.PurpleStart

val cards= listOf(
    Card(cardType = "VISA",
        cardNumber = "4468 4684 5456",
        cardName = "Bussiness",
        balance = 46.559,
        color = getGradient(PurpleStart, PurpleEnd)
    ),
    Card(cardType = "MASTER",
        cardNumber = "2466 5584 5456",
        cardName = "Saving",
        balance = 467.59,
        color = getGradient(BlueStart, BlueEnd)
    ),
    Card(cardType = "VISA",
        cardNumber = "4228 4684 5456",
        cardName = "School",
        balance = 465.89,
        color = getGradient(OrangeStart, OrangeEnd)
    ),
    Card(cardType = "VISA",
        cardNumber = "1248 9876 4223",
        cardName = "Trips",
        balance = 4265.89,
        color = getGradient(GreenStart, GreenEnd)
    )
)
fun getGradient(
    startColor: Color,
    endColor: Color,
): Brush{
    return Brush.horizontalGradient(
        colors = listOf(startColor,endColor)
    )
}
@Preview
@Composable
fun CardSection(){
    LazyRow {
        items(cards.size){ index->
            CardItem(index)
        }
    }
}
@Composable
fun CardItem(
    index:Int
){
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp;
    if(index== cards.size - 1){lastItemPaddingEnd= 16.dp}
    var image = painterResource(id = if (card.cardType=="VISA") R.drawable.ic_visa else R.drawable.ic_mastercard)
    Box(modifier = Modifier.padding(start = 16.dp,end = lastItemPaddingEnd)){
        Column(modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(card.color)
            .width(250.dp)
            .height(160.dp)
            .clickable { }
            .padding(vertical = 12.dp, horizontal = 16.dp,),
            verticalArrangement = Arrangement.SpaceBetween) {
            Image(painter = image, contentDescription = card.cardName,modifier = Modifier.width(60.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = card.cardName,color = Color.White,fontSize = 17.sp,fontWeight = FontWeight.Bold)
            Text(text = "$ ${card.balance}",color = Color.White,fontSize = 22.sp,fontWeight = FontWeight.Bold)
            Text(text = card.cardType,color = Color.White,fontSize = 17.sp,fontWeight = FontWeight.Bold)
        }
    }

}
package com.Amos.BankingApp
import android.util.Log;
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Amos.BankingApp.AccountCompoent.Avatar
import com.Amos.BankingApp.HomeCompoent.CardSection
import com.Amos.BankingApp.HomeCompoent.CurrenciesSection
import com.Amos.BankingApp.HomeCompoent.FinanceSection
import com.Amos.BankingApp.HomeCompoent.WalletSection
import com.Amos.BankingApp.NotificationCompoent.NotificationBar
import com.Amos.BankingApp.NotificationCompoent.NotificationSection
import com.Amos.BankingApp.WalletCompoent.AvailableBalanceSection
import com.Amos.BankingApp.WalletCompoent.TransactionDetailSection
import com.Amos.BankingApp.ui.theme.BankingAppTheme
import com.Amos.BankingApp.ui.theme.spacer
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("mytag","program running successful")
        super.onCreate(savedInstanceState)
        setContent {
            BankingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NotificationScreen()
                }
            }
        }
    }
    @Composable
    private fun SetBarColor(color: Color) {
        val systemUiController = rememberSystemUiController()
        SideEffect {
            systemUiController.setSystemBarsColor(
                color = color

            )
            Log.i("mytag","setBarController")
        }
    }

    @Composable
    fun HomeScreen() {
        Scaffold(
            bottomBar = {
                BottomNavigationBar(0)
            }
        ) { padding ->
            Log.i("mytag","HomeScreen")
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {

                WalletSection()
                CardSection()
                Spacer(modifier = Modifier.height(16.dp))
                FinanceSection()
                CurrenciesSection()
            }


        }
        Log.i("mytag","end of the program")
    }

    @Composable
    fun WalletScreen() {
        Scaffold(
            bottomBar = {
                BottomNavigationBar(1)
            }
        ) { padding ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = padding.calculateTopPadding())
            ) {
                AvailableBalanceSection()
                TransactionDetailSection()
            }

        }
    }
    @Preview
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
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add"
                    )
                }
            },
            floatingActionButtonPosition = FabPosition.End,
            bottomBar = {
                BottomNavigationBar(2)
            }
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
    @Composable
    fun AccountScreen() {
        Scaffold(
            bottomBar = {
                BottomNavigationBar(3)
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                Avatar()
                
            }
        }
    }
}


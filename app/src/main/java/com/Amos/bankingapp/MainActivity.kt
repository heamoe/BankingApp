package com.Amos.bankingapp
import android.util.Log;
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Amos.bankingapp.HomeCompoent.CardSection
import com.Amos.bankingapp.HomeCompoent.CurrenciesSection
import com.Amos.bankingapp.HomeCompoent.FinanceSection
import com.Amos.bankingapp.HomeCompoent.WalletSection
import com.Amos.bankingapp.WalletCompoent.AvailableBalanceSection
import com.Amos.bankingapp.WalletCompoent.TransactionDetailSection
import com.Amos.bankingapp.ui.theme.BankingAppTheme
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
                    WalletScreen()
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
                BottomNavigationBar()
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
    @Preview
    @Composable
    fun WalletScreen() {
        Scaffold(
            bottomBar = {
                BottomNavigationBar()
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
}


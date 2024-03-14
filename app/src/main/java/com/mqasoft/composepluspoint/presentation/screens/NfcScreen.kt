package com.mqasoft.composepluspoint.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mqasoft.composepluspoint.R
import com.mqasoft.composepluspoint.ui.theme.DarkBluePlusPoint
import com.mqasoft.composepluspoint.ui.theme.GreyPlusPoint

@Composable
fun NfcScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize().background(color = GreyPlusPoint)){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .background(color = DarkBluePlusPoint),
            ){
                Row(modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier.padding(start = 20.dp),
                        painter = painterResource(id = R.drawable.icon_arrow_white),
                        contentDescription = null
                    )
                    Text(
                        style = TextStyle.Default.copy(
                            fontSize = 16.sp,
                            color = Color.White
                        ),
                        modifier = Modifier.padding(),
                        text = "Wallet Transactions",
                    )
                    Text(text = "          ")
                }
            }
        }
    }
}

@Preview
@Composable
fun NfcScreenPreview() {
    NfcScreen()
}
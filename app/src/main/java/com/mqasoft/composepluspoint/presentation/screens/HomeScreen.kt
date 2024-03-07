package com.mqasoft.composepluspoint.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mqasoft.composepluspoint.R
import com.mqasoft.composepluspoint.presentation.ui.BottomScreenUI
import com.mqasoft.composepluspoint.presentation.ui.TransactionCardUI

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "520.00 TL",
                    style = TextStyle.Default.copy(
                        color = Color.White,
                        fontSize = 36.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.width(70.dp))
                Image(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(50.dp),
                    painter = painterResource(id = R.drawable.image_printer),
                    contentDescription = null)
                Image(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(50.dp),
                    painter = painterResource(id = R.drawable.image_profile),
                    contentDescription = null)

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Text(text = "55689", modifier = Modifier
                    .background(
                        color = Color.White, shape = RoundedCornerShape(4.dp)
                    )
                    .padding(horizontal = 5.dp))
                Text(text = "ABC Market", modifier = Modifier.padding(horizontal = 5.dp),
                    style = TextStyle.Default.copy(
                        color = Color.White
                    ))
            }
            Row(modifier = Modifier.padding(20.dp)) {
                TransactionCardUI(text = "Wallet Transaction", id = R.drawable.image_wallet, onClick = {} )
                TransactionCardUI(text = "Ticket Sales", id = R.drawable.image_qrticket, onClick = {})
                TransactionCardUI(text = "Inspection Sale", id = R.drawable.image_inspection, onClick = {})
            }
            BottomScreenUI {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White, shape = RoundedCornerShape(9.dp))
                    .padding(10.dp), contentAlignment = Alignment.CenterStart) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(modifier = Modifier.padding(end = 10.dp).size(27.dp)){
                            Image(modifier= Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.image_inspection), contentDescription = null)
                        }
                        Column() {
                            Text(text = "Harika", style = TextStyle.Default.copy(fontSize = 20.sp, fontWeight = FontWeight.Bold))
                            Text(text = "fjkdfkjkfnaslkdnaskdnasjkjkasndkjasndkasn", style = TextStyle.Default.copy(color = Color(0xff3e6275)))
                        }
                    }


                }
            }
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview(){
    HomeScreen()
}
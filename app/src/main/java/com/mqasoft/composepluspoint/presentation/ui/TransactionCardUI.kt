package com.mqasoft.composepluspoint.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TransactionCardUI(
    modifier: Modifier = Modifier,
    text: String,
    id: Int,
    onClick: () -> Unit
){
    Column(modifier = Modifier
        .padding(end = 15.dp, top = 10.dp, bottom = 10.dp)
        .clickable{onClick()}, horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier
                .size(72.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(12.dp)
                ), contentAlignment = Alignment.Center
        ) {
            Image(modifier = Modifier.size(36.dp), painter = painterResource(id = id), contentDescription = null)
        }
        Text(text = text, modifier = Modifier.width(72.dp),
            style = TextStyle.Default.copy(color = Color.White, fontSize = 14.sp,fontWeight = FontWeight.Medium), textAlign = TextAlign.Center
        )
    }
}
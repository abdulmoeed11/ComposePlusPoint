package com.mqasoft.composepluspoint.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mqasoft.composepluspoint.R

@Composable
fun PaymentOptionUI(
    modifier: Modifier = Modifier,
    id: Int,
    text: String,
    onClick: () -> Unit
){
    CardUI(modifier = modifier.height(65.dp).padding(bottom = 10.dp).clickable { onClick() }) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .padding(end = 10.dp)
                .size(27.dp)){
                Image(
                    modifier= Modifier.fillMaxSize(),
                    painter = painterResource(id = id),
                    contentDescription = null)
            }
            Text(text = text,
                style = TextStyle.Default.copy(fontSize = 16.sp, fontWeight = FontWeight.Bold))
            Spacer(modifier = Modifier.weight(1f))
            Image(modifier = Modifier.size(14.dp), painter = painterResource(id = R.drawable.icon_arrow), contentDescription = null)
        }
    }
}
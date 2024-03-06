package com.mqasoft.composepluspoint.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterButtonUI(
    modifier: Modifier = Modifier,
    buttonText: String,
    onClick: () -> Unit
){
    Button(
        onClick = onClick, modifier = modifier
            .padding(
                top = 30.dp, start = 10.dp, end = 10.dp
            )
            .background(color = Color(0xff4773c8), shape = RoundedCornerShape(16.dp)),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xff4773c8)
        )
    ) {
        Text(buttonText, style = TextStyle.Default.copy(fontSize = 16.sp))
    }

}
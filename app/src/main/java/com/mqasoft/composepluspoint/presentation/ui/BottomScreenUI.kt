package com.mqasoft.composepluspoint.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomScreenUI(
    content: @Composable () -> Unit
){
    Surface(
        modifier = Modifier
            .fillMaxSize(), // Adjust the fraction to change the height
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
        color = Color(0xFFEEF3F6), shadowElevation = 8.dp,

        ) {
        Column(modifier = Modifier.fillMaxSize().padding(20.dp)) {
            content()
        }
    }
}
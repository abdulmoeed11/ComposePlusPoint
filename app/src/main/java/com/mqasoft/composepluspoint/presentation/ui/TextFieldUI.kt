package com.mqasoft.composepluspoint.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldUI(
    text: String,
    onTextChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    hint: String
) {
    var isHintDisplayed by remember { mutableStateOf(text.isEmpty()) }
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 10.dp, end = 10.dp)
            .background(color = Color.White, shape = RoundedCornerShape(16.dp))
            .height(60.dp),
        contentAlignment = Alignment.Center,
    ){
        Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            BasicTextField(
                modifier = Modifier.padding(horizontal = 10.dp), value = text, onValueChange = onTextChanged,
                decorationBox = { innerTextField ->
                    if (isHintDisplayed) {
                        Text(
                            text = hint,
                            color = Color.LightGray
                        )
                    }
                    innerTextField()
                }
            )
        }
    }
}
package com.mqasoft.composepluspoint.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mqasoft.composepluspoint.R
import com.mqasoft.composepluspoint.presentation.ui.BottomScreenUI
import com.mqasoft.composepluspoint.presentation.ui.LoginButtonUI
import com.mqasoft.composepluspoint.presentation.ui.RegisterButtonUI
import com.mqasoft.composepluspoint.presentation.ui.TextFieldUI

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = null,
                modifier = Modifier
                    .padding(20.dp)
                    .padding(top = 100.dp),
                )
            BottomScreenUI {
                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    TextFieldUI(text = "", onTextChanged = {}, hint = "username")
                    TextFieldUI(text = "", onTextChanged = {}, hint = "password" )
                    LoginButtonUI(buttonText = "Login") {
                    }
                    Text(text = "Forgot your password?",
                        modifier = Modifier.padding(20.dp),
                        style = TextStyle.Default.copy(fontWeight = FontWeight.Bold)
                    )
                    RegisterButtonUI(buttonText = "Register") {

                    }
                }
            }

        }
    }
}

@Composable
@Preview
fun LoginScreenPreview() {
    LoginScreen()
}
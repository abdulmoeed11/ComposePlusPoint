package com.mqasoft.composepluspoint.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mqasoft.composepluspoint.presentation.ui.ScreenUI

@Composable
fun NfcScreen(
    modifier: Modifier = Modifier,
) {
    ScreenUI(screenTitle = "Wallet Transaction",
        onClickBack = { /*TODO*/ },
        modifier = modifier
    ) {
        
    }
}

@Preview
@Composable
fun NfcScreenPreview() {
    NfcScreen()
}
package com.sc.foodconnect.ui.screens.authentication.signup

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sc.foodconnect.R

@Composable
fun ForgotPasswordScreen(modifier: Modifier, navController: NavHostController) {
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var codeInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }
    var confirmPasswordInput by remember { mutableStateOf(TextFieldValue("")) }
    var isVisible by remember { mutableStateOf(false) }

    Column(
        modifier = modifier.padding(16.dp).fillMaxSize()
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =Alignment.CenterHorizontally,
    ) { }


}


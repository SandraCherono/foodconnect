package com.sc.foodconnect.ui.screens.authentication.login

import android.R.attr.onClick
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sc.foodconnect.R
import com.sc.foodconnect.ui.theme.primaryColor
import com.sc.foodconnect.ui.theme.secondaryColor


@Composable
fun LoginScreen(){
//     inputs
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }
    var isVisible by remember {mutableStateOf(false)}

    val modifier = null
    val pagePadding = null
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.undraw_breakfast_rgx5),
            contentDescription = "logo",

        )

        //welcome message
        Text(
            text="Login to get started",
            style= TextStyle(
                fontSize=24.sp,
                fontWeight = FontWeight.Bold,
                color= primaryColor
            )
        )
        Spacer(modifier=Modifier.height(24.dp))
        //        email input
        OutlinedTextField(
            value = emailInput,
            onValueChange = {emailInput = it },
            label = { Text(text = "Email Address") } ,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription= "Email Input",
                    tint =primaryColor
                )
            },
            colors  = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),
            maxLines = 1,
            shape = RoundedCornerShape(24.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email ),
            modifier = Modifier.fillMaxWidth()
        )
        //        password input
        OutlinedTextField(
            value = passwordInput,
            onValueChange = {passwordInput = it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.password_24dp_870819_fill0_wght400_grad0_opsz24),
                    contentDescription= "Password",
                    tint =primaryColor
                )
            },
            label = { Text(text = "Password") },
            visualTransformation = if (isVisible) VisualTransformation.None
            else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                IconButton(onClick =
                    {isVisible = !isVisible}
                ) {
                    if (isVisible) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.visibility_off_24),
                            contentDescription = "Password",
                            tint = primaryColor
                        )
                    } else {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.visibility24),
                            contentDescription = "Password",
                            tint = primaryColor
                        )
                    }

                }},




            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )
        //        button
        OutlinedButton(
            onClick = {}
        ) {
            Text(text = "login",
                modifier = Modifier.padding(horizontal = 24.dp))
        }

//             row
        Row(){
            Text(text = "Forgot Password")
            Text(text = "No account?")
        }
    }
}
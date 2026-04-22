package com.sc.foodconnect.ui.screens.authentication.forgotpassword

import android.R.attr.enabled
import android.R.attr.maxLines
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
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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


/*
* Structure(layout) : COLUMN
* Features(widgets):
*   - lottie animation
*   - email input
*   - button to submit
*   - text buttons:
*           - go to login page
*           - go to sign up page
* */



@Composable
fun ForgotPasswordScreen(modifier: Modifier){
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var codeInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }
    var confirmPasswordInput by remember { mutableStateOf(TextFieldValue("")) }
    var isVisible by remember {mutableStateOf(false)}



//    structure:
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp).fillMaxSize()
    ) {

    Image(
        imageVector = ImageVector.vectorResource(R.drawable.undraw_breakfast_rgx5),
        contentDescription = "logo",

        )
// page title
        Text(text="Oops! Forgot Password ?",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = primaryColor
            ))
        Spacer(modifier= Modifier.height(24.dp))

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
        Spacer(modifier= Modifier.height(24.dp))
        OutlinedTextField(

            value = codeInput,
            onValueChange = {codeInput = it },
            label = { Text(text = "Code") } ,

            colors  = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),
            maxLines = 1,
            shape = RoundedCornerShape(24.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(24.dp))


        OutlinedTextField(
            value = passwordInput,
            onValueChange = {passwordInput = it },
            leadingIcon = {

                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.password_24dp_870819_fill0_wght400_grad0_opsz24),
                    contentDescription = "password input",
                    tint = primaryColor
                )
            },
            placeholder = { Text(text = "Password") },
            visualTransformation = if (isVisible) VisualTransformation.None
            else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                IconButton(onClick = { isVisible = !isVisible })
                {
                    if (isVisible) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.visibility_off_24),
                            contentDescription = "Password",
                            tint = primaryColor
                        )
                    }
                    else {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.visibility24),
                            contentDescription = "Password",
                            tint = primaryColor
                        )
                    }
                }
            },
            maxLines = 1,
            shape = RoundedCornerShape(24.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password ),

            Spacer(modifier = Modifier.height(24.dp)),
            OutlinedTextField(
                value = confirmPasswordInput,
                onValueChange = { confirmPasswordInput = it },
                leadingIcon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.password_24dp_870819_fill0_wght400_grad0_opsz24),
                        contentDescription = "Password",
                        tint = primaryColor
                    )
                },
                placeholder = { Text(text = "Confirm Password") },
                visualTransformation = if (isVisible) VisualTransformation.None
                else {
                    PasswordVisualTransformation()
                },
                trailingIcon = {
                    IconButton(onClick = { isVisible = !isVisible })
                    {
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

                    }
                },
                maxLines = 1,
                shape = RoundedCornerShape(24.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                Spacer(modifier = Modifier.height(24.dp)),






//        submit button
    OutlinedButton(
        onClick = {},
        border = ButtonDefaults.outlinedButtonBorder( enabled = false),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color(0xFFFFFFFF),
            containerColor = primaryColor
        ),
    ) {
        Text("get password reset")
    }
//        text buttons => back to login , no account?
    Row{
        TextButton(
            onClick = {}
        ) {
            Text(
                text="back to login",
                style = TextStyle(
                    fontSize = 11.sp,
                )
            )
        }
        TextButton(
            onClick = {}
        ) {
            Text(text="no account?",
                style = TextStyle(
                    fontSize = 11.sp,
                ))
        }
    }

}
}



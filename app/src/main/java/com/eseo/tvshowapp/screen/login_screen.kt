package com.eseo.tvshowapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.eseo.tvshowapp.ui.theme.Purple40
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eseo.tvshowapp.ui.theme.PurpleGrey40

@Preview
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

    var email by remember { mutableStateOf("email") }
    val onEmailChange = { newEmail : String ->
        email = newEmail
    }

    var password by remember { mutableStateOf("password") }
    val onPasswordChange = { newPassword : String ->
        password = newPassword
    }

    var checkedValue by remember { mutableStateOf(false) }
    val onCheckedValueChange = { newCheckedValue : Boolean ->
        checkedValue = newCheckedValue
    }

    Column(
        modifier = modifier.fillMaxSize()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment
            .CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Email
        TextField(
            value = email,
            onValueChange = onEmailChange,
            placeholder = {
                Text(text = "Email")
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Password
        TextField(
            value = password,
            onValueChange = onPasswordChange,
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Checkbox(
                checked = checkedValue,
                onCheckedChange = onCheckedValueChange,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    uncheckedColor = Color.LightGray,
                )
            )
            Text(
                text = "Remember me",
                color = Color.White,
                fontSize = 26.sp,
            )
        } // Fin du ROW

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta
            )
        ) {
            Text(
                text = "Login",
                color = Color.White,
                fontSize = 26.sp,
            )
        }
    }
}



























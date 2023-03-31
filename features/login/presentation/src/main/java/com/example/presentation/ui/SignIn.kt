package com.example.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.imdbapp.R

@Composable
fun RegisterScreen(
    navController: NavController,
    navigateEvent: () -> Unit
) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            modifier = Modifier.padding(32.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = stringResource(R.string.screen_title),
                color = Color.Black,
                fontSize = 64.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.create_account),
                color = Color.Gray,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Start)
            )
            UserNameAndEmailTextField(
                label = R.string.name,
                value = name,
                onValueChanged = { name = it },
                icon = { Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = stringResource(R.string.person_icon)
                    )
                }
            )
            UserNameAndEmailTextField(
                label = R.string.email,
                value = email,
                onValueChanged = { email = it },
                icon = { Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = stringResource(R.string.email_icon)
                    )
                }
            )
            PasswordTextField(
                label = R.string.password,
                value = password,
                onValueChanged = { password = it },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = stringResource(R.string.lock_icon)
                    )
                }
            )
            Text(
                text = stringResource(R.string.password_constraint),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(size = 8.dp),
                onClick = {
                    navController.popBackStack()
                    navigateEvent()
                }) {Text(stringResource(R.string.accept_button), fontSize = 18.sp)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun RegisterPreview() {
    /*IMDbAppTheme {
        RegisterScreen(navController = rememberNavController())
    }*/
}
package com.lac.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lac.components.ui.theme.IMDbAppTheme
import com.lac.imdbapp.R


@Composable
fun LoginScreen(
    navigateEvent: () -> Unit,
    navController: NavHostController
) {
    var userName by remember { mutableStateOf("") }
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
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(Modifier.height(16.dp))
            UserNameAndEmailTextField(
                label = R.string.user_name,
                value = userName,
                onValueChanged = { userName = it },
                icon = { Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = stringResource(R.string.person_icon)
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
                text = stringResource(R.string.forgot_password),
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clickable {
                        navigateEvent()
                    }
            )
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(size = 8.dp),
                onClick = {
                    /*TODO*/
                }) {Text(stringResource(R.string.login_button), fontSize = 18.sp)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    IMDbAppTheme {
        LoginScreen(navController = rememberNavController(), navigateEvent = {})
    }
}
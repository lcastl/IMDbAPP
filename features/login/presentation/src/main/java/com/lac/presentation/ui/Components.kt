package com.lac.presentation.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.lac.imdbapp.R

@Composable
fun UserNameAndEmailTextField(
    @StringRes label: Int,
    value: String,
    onValueChanged: (String) -> Unit,
    icon: @Composable () -> Unit,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        label = { Text(stringResource(label)) },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        leadingIcon = icon,
    )
}

@Composable
fun PasswordTextField(
    @StringRes label: Int,
    value: String,
    onValueChanged: (String) -> Unit,
    icon: @Composable () -> Unit
) {
    var showPassword by remember {
        mutableStateOf(false)
    }
    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        label = { Text(stringResource(label)) },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        leadingIcon = icon,
        trailingIcon = {
            IconButton(onClick = { showPassword = !showPassword }) {
                Icon(
                    imageVector =
                    if (showPassword) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility,
                    contentDescription =
                    if (showPassword) stringResource(R.string.show_password)
                    else stringResource(R.string.hide_password)
                )
            }
        },
        visualTransformation =
        if (showPassword) VisualTransformation.None else PasswordVisualTransformation()
    )
}

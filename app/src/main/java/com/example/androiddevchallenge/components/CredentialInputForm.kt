package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun CredentialsInputForm(
    leadingIcon: ImageVector,
    labelText: String,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        modifier = modifier,
        value = "",
        leadingIcon = {
            Icon(
                tint = MaterialTheme.colors.onSurface,
                imageVector = leadingIcon,
                contentDescription = null,
                modifier = Modifier.size(size = 24.dp)
            )
        },
        onValueChange = {},
        label = {
            Text(
                text = labelText,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colors.onSurface,
            unfocusedBorderColor = MaterialTheme.colors.onSurface
        )

    )

}
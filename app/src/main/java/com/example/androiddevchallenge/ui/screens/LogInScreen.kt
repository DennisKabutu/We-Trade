package com.example.androiddevchallenge.ui.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.Password
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.components.CredentialsInputForm
import com.example.androiddevchallenge.components.PrimaryButton
import com.example.androiddevchallenge.ui.theme.MyTheme
import java.util.*


// To represent The Whole Log in Screen
@Composable
fun LogInScreen(navHostController: NavHostController) {
    Surface{
        Column(modifier = Modifier.fillMaxSize()) {
            WelcomeBackSection()
            LogInCredentialsInputSection(navHostController)

        }
    }

}

//Welcome Back section

@Composable
fun WelcomeBackSection() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.login_bg),
            contentDescription = "Log in background",
            contentScale = ContentScale.Crop
        )
        Text(
            color = MaterialTheme.colors.onBackground,
            style = MaterialTheme.typography.h1,
            text = "Welcome\n Back ",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .paddingFromBaseline(top = 152.dp)
        )

    }

}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun LoginScreenPreview() {
    MyTheme {

        Column(modifier = Modifier.fillMaxSize()) {
            WelcomeBackSection()
          //  LogInCredentialsInputSection(navHostController)

        }

    }

}

// CredentialInput form to house the password and email input form

@Composable
fun LogInCredentialsInputSection(navHostController: NavHostController) {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        CredentialsInputForm(
            leadingIcon = Icons.Outlined.Mail,
            labelText = "Email",
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth()
                .height(56.dp)

        )
        CredentialsInputForm(
            leadingIcon = Icons.Outlined.Password,
            labelText = "Password",
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth()
                .height(56.dp)

        )
        Spacer(modifier = Modifier.height(height = 16.dp))
        ButtonLogIn(navHostController)

    }
}

//Log in Button

@Composable
fun ButtonLogIn(navHostController: NavHostController) {
    PrimaryButton(
        onClick= {navHostController.navigate("home screen")},
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp), buttonText = "log in".uppercase(Locale.getDefault())

    )

}

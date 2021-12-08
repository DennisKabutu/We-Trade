package com.example.androiddevchallenge

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.components.PrimaryButton
import com.example.androiddevchallenge.ui.theme.MyTheme


@Composable
fun WelcomeScreenBackground() {

    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.welcome_bg),
            contentDescription = "Welcome Background Image",
            contentScale = ContentScale.Crop
        )

    }
}


@Composable
fun WelcomeScreenContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        WelcomeScreenLogo(modifier = Modifier
            .align(alignment = Alignment.Center)
            .height(48.dp)

        )
        Row (
            modifier = Modifier
                .align(
                    alignment = Alignment.BottomCenter
                )
                .fillMaxWidth().padding(vertical = 32.dp, horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            PrimaryButton(modifier = Modifier.height(48.dp).width(20.dp * 8), buttonText = "GET STARTED") //
            LogInButton()
        }

        Spacer(modifier = Modifier.height(32.dp).align(alignment = Alignment.BottomEnd))

    }
}


@Composable
fun WelcomeScreenLogo(modifier: Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Welcome Background Image",
        contentScale = ContentScale.Crop
    )
}

@Composable
fun LogInButton() {
    OutlinedButton(
        shape = MaterialTheme.shapes.medium,
        onClick = { /*TODO*/ },
        modifier = Modifier
            .height(48.dp)
            .width(20.dp * 8)
            .border(
                width = 2.dp,
                color = MaterialTheme.colors.primary,
                shape = RoundedCornerShape(size = 24.dp)
            ),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.Transparent,
            contentColor = MaterialTheme.colors.primary
        )
    ) {
        Text(text = "LOG IN", style = MaterialTheme.typography.button)

    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewWelcomeButton() {
    MyTheme {
        Box() {

            WelcomeScreenBackground()
            WelcomeScreenContent()

        }


    }
}
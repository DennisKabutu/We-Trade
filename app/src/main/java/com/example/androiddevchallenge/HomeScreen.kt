package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.components.PrimaryButton
import java.util.*

// Tabs Section
@Composable
fun TabSection() {
    val tabList = listOf("ACCOUNTS", "WATCHLIST", "PROFILE")
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        tabList.forEach {
            if (it == tabList[0])
                HomeTabItem(tabText = it, enabled = true)
            else HomeTabItem(tabText = it)
        }
    }
}

@Composable
fun HomeTabItem(tabText: String, enabled: Boolean = false) {
    TextButton(
        modifier = Modifier.paddingFromBaseline(top = 64.dp, bottom = 8.dp),
        onClick = { /*TODO*/ },
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            disabledBackgroundColor = Color.Transparent,
            contentColor = MaterialTheme.colors.onBackground,
            disabledContentColor = Color.White.copy(alpha = 0.3f)
        )
    ) {
        Text(text = tabText, style = MaterialTheme.typography.button)

    }

}


//balance section

@Composable
fun BalanceHeader(modifier: Modifier) {
    Text(
        text = "Balance",
        textAlign = TextAlign.Center,
        //fontStyle = ,
        modifier = modifier,
        style = MaterialTheme.typography.subtitle1,
        color = MaterialTheme.colors.onBackground
    )

}

@Composable
fun Balance(modifier: Modifier) {
    Text(
        text = "$73,589.01",
        style = MaterialTheme.typography.h1,
        color = MaterialTheme.colors.onBackground,
        modifier = modifier
    )

}

@Composable
fun BalanceGain(modifier: Modifier) {
    Text(
        text = "+412.35 today",
        style = MaterialTheme.typography.subtitle1,
        color = Color.Green,
        modifier = modifier
    )

}

// Today's gain section
//Transact section

@Composable
fun TransactButton() {
    PrimaryButton(
        modifier = Modifier
            .fillMaxWidth()
            .height(height = 48.dp)
            .padding(horizontal = 16.dp),
        buttonText = "Transact".toUpperCase(Locale.ROOT),
        onClick = {}
    )

}
//List of graph view options

@Composable
fun GraphViewOptionsSection() {
    //FixMe To done on the view
    val graphViewOptions = listOf(
        "Week",
        "EFT",
        "Stocks",
        "Funds",
        "Bitcoin",
        "Bounds"
    )

    LazyRow(
        horizontalArrangement = Arrangement.SpaceAround,
        contentPadding = PaddingValues(all = 16.dp),
    ) {
        items(graphViewOptions){graphViewOption ->
            if (graphViewOptions.first() == graphViewOption) {
                GraphViewOptionsItem(optionName = graphViewOption, showIcon = true)
            } else GraphViewOptionsItem(optionName = graphViewOption)

        }
    }
}

// GraphViewOptions Item

@Composable
fun GraphViewOptionsItem(optionName: String, showIcon: Boolean = false) {
    Box(
        contentAlignment = Center,
        modifier = Modifier
            .padding(horizontal = 8.dp)
            .height(height = 40.dp)
            .width(if (showIcon) 8.dp * 11 else 8.dp * 9)
            .border(
                width = 1.dp,
                color = MaterialTheme.colors.onBackground,
                shape = MaterialTheme.shapes.large
            )


    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = optionName,
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.body1
            )
            Spacer(modifier = Modifier.width(width = 8.dp))

            if (showIcon)
                Icon(
                    modifier = Modifier.size(size = 16.dp),
                    imageVector = Icons.Outlined.ExpandMore,
                    contentDescription = null,
                    tint = MaterialTheme.colors.onBackground
                )
        }


    }

}


//graph section

@Composable
fun GraphSection() {
    Image(
        modifier= Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        contentScale = ContentScale.FillBounds,
        painter = painterResource(id = R.drawable.home_illos),
        contentDescription = null,
    )

}
// position Section


@Composable
fun PositionButton(modifier: Modifier) {
    TextButton(onClick = { /*TODO*/ }, modifier = modifier) {
        Text(
            textAlign = TextAlign.Center,
            text = "Position",
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.button
        )

    }

}


// Preview


@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 0.dp)
    ) {
        Column(
            horizontalAlignment = CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colors.background)
        ) {
            TabSection()
            BalanceHeader(
                modifier = Modifier
                    .paddingFromBaseline(top = 32.dp, bottom = 8.dp),
            )
            Balance(
                modifier = Modifier
                    .paddingFromBaseline(
                        top = 48.dp,
                        bottom = 24.dp
                    )

            )

            BalanceGain(
                modifier = Modifier
                    .paddingFromBaseline(top = 16.dp, bottom = 32.dp)
                    .align(alignment = CenterHorizontally)

            )
            TransactButton()



            Spacer(modifier = Modifier.height(16.dp))

            GraphViewOptionsSection()


            GraphSection()

            Spacer(modifier = Modifier.height(32.dp))

        }
        PositionButton(
            Modifier
                .height(8.dp * 8)
                .fillMaxWidth()
                .paddingFromBaseline(top = 40.dp)
                .background(color = MaterialTheme.colors.surface)
                .align(BottomCenter)
        )

    }

}



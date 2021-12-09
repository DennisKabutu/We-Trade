package com.example.androiddevchallenge

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PositionScreen() {
    val listCompanies = CompaniesPosition

    MyTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            PositionHeader()

            PositionList(listOfPositions = listCompanies)
        }

    }


}


@Composable
fun PositionHeader() {

    Text(
        text = "Positions",
        modifier = Modifier.paddingFromBaseline(top = 8.dp, bottom = 24.dp),
        style = MaterialTheme.typography.body1,
        color = MaterialTheme.colors.onSurface,
        textAlign = TextAlign.Center
    )

}

@Composable
fun PositionList(listOfPositions: List<Positions>) {
    LazyColumn {
        items(
            count = listOfPositions.size,
            itemContent = {
                listOfPositions.forEach {
                    PositionsListItem(positions = it)
                }
            }
        )
    }
}

@Composable
fun PositionsListItem(positions: Positions) {
    Column(
        modifier = Modifier
            .height(56.dp)
            .padding(horizontal = 16.dp)
    ) {
        Divider(
            Modifier
                .height(1.dp)
                .fillMaxWidth()
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // amount and gain Column
            Row {
                Column {
                    Text(
                        text = positions.amount,
                        color = MaterialTheme.colors.onSurface,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.paddingFromBaseline(top = 24.dp)
                    )
                    Text(
                        text = if (positions.gain < 0) "${positions.gain}%" else "+${positions.gain}%",
                        color = if (positions.gain < 0) Color.Red else Color.Green,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp)
                    )
                }
                Spacer(modifier = Modifier.width(24.dp))

                Column {
                    Text(
                        text = positions.abbre,
                        style = MaterialTheme.typography.h3,
                        color = MaterialTheme.colors.onSurface,
                        modifier = Modifier.paddingFromBaseline(top = 24.dp)
                    )
                    Text(
                        text = positions.fullName,
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onSurface,
                        modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp)
                    )
                }

            }

            Image(
                painter = painterResource(id = positions.graph),
                contentDescription = null
            )

        }

    }

}
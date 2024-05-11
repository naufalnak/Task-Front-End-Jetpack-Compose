package com.il.tugasfejc.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.il.tugasfejc.model.Tayang
import com.il.tugasfejc.model.Trend
import com.il.tugasfejc.data.DummyData
import com.il.tugasfejc.component.TayangItem
import com.il.tugasfejc.component.TrendItem
import com.il.tugasfejc.nav.Screen


@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    tayang: List<Tayang> = DummyData.dataTayang,
    trend: List<Trend> = DummyData.dataTrend,
) {
    LazyColumn (
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ){
        item {
            Column(modifier = modifier) {
                Text(
                    text = "Sedang Tayang",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                )
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(tayang, key = { it.id }) {
                        TayangItem(tayang = it) { tayangId ->
                            navController.navigate(Screen.DetailMent.route + "/$tayangId")
                        }
                    }
                }
            }
            Column(modifier = modifier) {
                Text(
                    text = "Sedang Trending",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(14.dp)
                )
            }
        }
        items(trend, key = { it.id }) {
            TrendItem(
                trend = it,
                modifier = Modifier.padding(horizontal = 16.dp)
            ){
                    trendId ->
                navController.navigate(Screen.DetailTrend.route + "/$trendId")
            }
        }
    }
}
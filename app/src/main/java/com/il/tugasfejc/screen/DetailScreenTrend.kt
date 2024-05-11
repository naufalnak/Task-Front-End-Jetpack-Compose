package com.il.tugasfejc.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.il.tugasfejc.data.DummyData
import com.il.tugasfejc.model.Trend

@Composable
fun DetailTrending(
    modifier: Modifier = Modifier,
    navController: NavController,
    trendId: Int?
) {
    val newTrendList = DummyData.dataTrend.filter { mentee ->
        mentee.id == trendId
    }
    Column(
        modifier = modifier
    ) {
        DetailTrendingContent(newTrendList = newTrendList)
    }
}

@Composable
private fun DetailTrendingContent(
    newTrendList: List<Trend>,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier.padding(16.dp)
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(data = newTrendList[0].photodetail)
                    .build(),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(height = 250.dp, width = 170.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentDescription = "Poster Movie"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.padding(4.dp)) {
                Text(
                    text = newTrendList[0].name,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "(${newTrendList[0].nickname})",
                    style = MaterialTheme.typography.titleSmall,
                )
            }
        }
        Text(
            text = "${newTrendList[0].explain}",
            style = MaterialTheme.typography.titleSmall,
        )
    }

}

@Preview
@Composable
private fun DetailTrendingPreview() {
    DetailTrendingContent(newTrendList = DummyData.dataTrend)
}
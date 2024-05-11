package com.il.tugasfejc.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.il.tugasfejc.R

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {
    val borderWidth = 4.dp
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ){
        Spacer(modifier = Modifier.padding(top = 45.dp))
        Image(
            painter = painterResource(id = R.drawable.nopal),
            contentDescription = "PP",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(height = 200.dp, width = 200.dp)
                .clip(RoundedCornerShape(16.dp))
                .align(Alignment.CenterHorizontally)
                .border(
                    BorderStroke(borderWidth, Color(0xFF1F4287)),
                    CircleShape
                )
        )
        Text(
            text = "Naufal Andresya Kholish",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "naufal.ndak17@gmail.com",
            style = MaterialTheme.typography.titleSmall,
        )
        Text(
            text = "Universitas Gunadarma",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Informatika",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun AboutScreenPrev(){
    AboutScreen()
}
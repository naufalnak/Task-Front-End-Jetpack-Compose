package com.il.tugasfejc.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.il.tugasfejc.component.GalleryItem
import com.il.tugasfejc.data.DummyData
import com.il.tugasfejc.model.Galery
import com.il.tugasfejc.ui.theme.TugasFEJCTheme

@Composable
fun GalleryScreen(
    modifier: Modifier = Modifier,
    galery: List<Galery> = DummyData.dataGallery
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(galery, key = { it.id }) {
            GalleryItem(galery = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    TugasFEJCTheme {
        GalleryScreen(galery = DummyData.dataGallery)
    }
}
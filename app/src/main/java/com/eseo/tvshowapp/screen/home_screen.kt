package com.eseo.tvshowapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eseo.tvshowapp.component.HorizontalTvShow
import com.eseo.tvshowapp.data.tvShows
import com.eseo.tvshowapp.ui.theme.PurpleGrey40

@Preview
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(PurpleGrey40),
        verticalArrangement = Arrangement.spacedBy(
            space = 20.dp
        ),
        contentPadding = PaddingValues(20.dp)
    ) {
        items(tvShows.size) { index ->
            HorizontalTvShow(index)
        }
    }
}




















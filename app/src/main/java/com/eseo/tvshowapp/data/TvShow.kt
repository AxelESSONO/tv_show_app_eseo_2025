package com.eseo.tvshowapp.data

data class TvShow(
    val id : Int,
    val title : String,
    val imageUrl : String
)

val tvShows = listOf(
    TvShow(
        id = 35624,
        title = "Flash",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/35624.jpg"
    ),
    TvShow(
        id = 23455,
        title = "Game Of Thrones",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/23455.jpg"
    ),
    TvShow(
        id = 29560,
        title = "Arrow",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/29560.jpg"
    ),
    TvShow(
        id = 43467,
        title = "Lucifer",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/43467.com"
    ),
    TvShow(
        id = 43234,
        title = "Supergirl",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/43234.jpg"
    ),
    TvShow(
        id = 46692,
        title = "DC's Legends of Tomorrow",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/43234.jpg"
    ),
    TvShow(
        id = 46693,
        title = "The Big",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/46692.jpg"
    ),
    TvShow(
        id = 46694,
        title = "Nothing",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/46692.jpg"
    ),
    TvShow(
        id = 46695,
        title = "Anymore",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/46692.jpg"
    ),
    TvShow(
        id = 46696,
        title = "every Thing",
        imageUrl = "https://static.episodate.com/images/tv-show/thumbnail/46692.jpg"
    ),
)

package com.example.projeto_integrador.domain.model.movies

data class Movie(
    val discoverMovieId: Long,
    val discoverMovieTitle: String,
    val discoverVoteAverage: Float,
    val favorite: Boolean = false,
    val discoverPosterPath: String
) {
    val popularity: Float
        get() = discoverVoteAverage.times(10)
}
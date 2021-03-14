package com.example.movieappdiary2

data class MovieData(var title: String = "",
                     var description: String = "",
                     var rating: Float = 0f,
                     var genres: String? = "",
                     var creators : String = "",
                     var actors: String = ""
)
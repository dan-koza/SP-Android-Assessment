package com.superpedestrian.codechallenge.models

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException

@Suppress("unused")
object MovieJson {

    @Throws(JsonSyntaxException::class)
    fun toMovie(movieJson: String): Movie {
        return Gson().fromJson(movieJson, Movie::class.java)
    }

    const val THE_GODFATHER = "{\n" +
            "  \"Title\": \"The Godfather\",\n" +
            "  \"Year\": \"1972\",\n" +
            "  \"Rated\": \"R\",\n" +
            "  \"Released\": \"24 Mar 1972\",\n" +
            "  \"Runtime\": \"175 min\",\n" +
            "  \"Genre\": \"Crime, Drama\",\n" +
            "  \"Director\": \"Francis Ford Coppola\",\n" +
            "  \"Writer\": \"Mario Puzo, Francis Ford Coppola\",\n" +
            "  \"Actors\": \"Marlon Brando, Al Pacino, James Caan\",\n" +
            "  \"Plot\": \"The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.\",\n" +
            "  \"Language\": \"English, Italian, Latin\",\n" +
            "  \"Country\": \"United States\",\n" +
            "  \"Awards\": \"Won 3 Oscars. 32 wins & 31 nominations total\",\n" +
            "  \"Poster\": \"https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg\",\n" +
            "  \"Ratings\": [\n" +
            "    {\n" +
            "      \"Source\": \"Internet Movie Database\",\n" +
            "      \"Value\": \"9.2/10\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Source\": \"Rotten Tomatoes\",\n" +
            "      \"Value\": \"97%\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Source\": \"Metacritic\",\n" +
            "      \"Value\": \"100/100\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"Metascore\": \"100\",\n" +
            "  \"imdbRating\": \"9.2\",\n" +
            "  \"imdbVotes\": \"1,880,874\",\n" +
            "  \"imdbID\": \"tt0068646\",\n" +
            "  \"Type\": \"movie\",\n" +
            "  \"DVD\": \"11 May 2004\",\n" +
            "  \"BoxOffice\": \"\$136,381,073\",\n" +
            "  \"Production\": \"N/A\",\n" +
            "  \"Website\": \"N/A\",\n" +
            "  \"Response\": \"True\"\n" +
            "}\n"

    const val THE_SHAWSHANK_REDEMPTION = "{\n" +
            "  \"Title\": \"The Shawshank Redemption\",\n" +
            "  \"Year\": \"1994\",\n" +
            "  \"Rated\": \"R\",\n" +
            "  \"Released\": \"14 Oct 1994\",\n" +
            "  \"Runtime\": \"142 min\",\n" +
            "  \"Genre\": \"Drama\",\n" +
            "  \"Director\": \"Frank Darabont\",\n" +
            "  \"Writer\": \"Stephen King, Frank Darabont\",\n" +
            "  \"Actors\": \"Tim Robbins, Morgan Freeman, Bob Gunton\",\n" +
            "  \"Plot\": \"Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion.\",\n" +
            "  \"Language\": \"English\",\n" +
            "  \"Country\": \"United States\",\n" +
            "  \"Awards\": \"Nominated for 7 Oscars. 21 wins & 43 nominations total\",\n" +
            "  \"Poster\": \"https://m.media-amazon.com/images/M/MV5BNDE3ODcxYzMtY2YzZC00NmNlLWJiNDMtZDViZWM2MzIxZDYwXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_SX300.jpg\",\n" +
            "  \"Ratings\": [\n" +
            "    {\n" +
            "      \"Source\": \"Internet Movie Database\",\n" +
            "      \"Value\": \"9.3/10\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Source\": \"Rotten Tomatoes\",\n" +
            "      \"Value\": \"91%\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Source\": \"Metacritic\",\n" +
            "      \"Value\": \"82/100\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"Metascore\": \"82\",\n" +
            "  \"imdbRating\": \"9.3\",\n" +
            "  \"imdbVotes\": \"2,718,502\",\n" +
            "  \"imdbID\": \"tt0111161\",\n" +
            "  \"Type\": \"movie\",\n" +
            "  \"DVD\": \"21 Dec 1999\",\n" +
            "  \"BoxOffice\": \"\$28,767,189\",\n" +
            "  \"Production\": \"N/A\",\n" +
            "  \"Website\": \"N/A\",\n" +
            "  \"Response\": \"True\"\n" +
            "}\n"

    const val THE_AVENGERS = "{\n" +
            "  \"Title\": \"The Avengers\",\n" +
            "  \"Year\": \"2012\",\n" +
            "  \"Rated\": \"PG-13\",\n" +
            "  \"Released\": \"04 May 2012\",\n" +
            "  \"Runtime\": \"143 min\",\n" +
            "  \"Genre\": \"Action, Sci-Fi\",\n" +
            "  \"Director\": \"Joss Whedon\",\n" +
            "  \"Writer\": \"Joss Whedon, Zak Penn\",\n" +
            "  \"Actors\": \"Robert Downey Jr., Chris Evans, Scarlett Johansson\",\n" +
            "  \"Plot\": \"Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.\",\n" +
            "  \"Language\": \"English, Russian, Hindi\",\n" +
            "  \"Country\": \"United States\",\n" +
            "  \"Awards\": \"Nominated for 1 Oscar. 38 wins & 80 nominations total\",\n" +
            "  \"Poster\": \"https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg\",\n" +
            "  \"Ratings\": [\n" +
            "    {\n" +
            "      \"Source\": \"Internet Movie Database\",\n" +
            "      \"Value\": \"8.0/10\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Source\": \"Rotten Tomatoes\",\n" +
            "      \"Value\": \"91%\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Source\": \"Metacritic\",\n" +
            "      \"Value\": \"69/100\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"Metascore\": \"69\",\n" +
            "  \"imdbRating\": \"8.0\",\n" +
            "  \"imdbVotes\": \"1,402,797\",\n" +
            "  \"imdbID\": \"tt0848228\",\n" +
            "  \"Type\": \"movie\",\n" +
            "  \"DVD\": \"25 Sep 2012\",\n" +
            "  \"BoxOffice\": \"\$623,357,910\",\n" +
            "  \"Production\": \"N/A\",\n" +
            "  \"Website\": \"N/A\",\n" +
            "  \"Response\": \"True\"\n" +
            "}\n"
}
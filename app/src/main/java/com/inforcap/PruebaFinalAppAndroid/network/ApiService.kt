package com.inforcap.PruebaFinalAppAndroid.network

import com.inforcap.PruebaFinalAppAndroid.model.FigureDetailEntity
import com.inforcap.PruebaFinalAppAndroid.model.MovieEntity
import com.inforcap.PruebaFinalAppAndroid.network.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("figuras")
    suspend fun getAllFigures() : Response<List<MovieEntity>>

    @GET("figuras/{id}")
    suspend fun getDetail(
        @Path("id") figureId: Int
    ) : Response<FigureDetailEntity>


    @GET("now_playing")
    suspend fun getAllMovies(
        @Query("api_key") apiKey: String
    ) : Response<MovieResponse>

    @GET("popular")
    suspend fun getPopular(
        @Query("api_key") apiKey: String
    ) : Response<MovieResponse>

    @GET("top_rated")
    suspend fun getTopRated(
        @Query("api_key") apiKey: String
    ) : Response<MovieResponse>

    @GET("upcoming")
    suspend fun getUpcoming(
        @Query("api_key") apiKey: String
    ) : Response<MovieResponse>



}
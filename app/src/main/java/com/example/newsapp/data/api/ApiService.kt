package com.example.newsapp.data.api

import com.example.newsapp.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
   suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "b87c76dce09d40baa85b08cba3b7ed7f"
    ): Response<NewsResponse>
}
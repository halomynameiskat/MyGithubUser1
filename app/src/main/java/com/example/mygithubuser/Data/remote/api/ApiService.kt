package com.example.mygithubuser.Data.remote.api


import com.example.mygithubuser.BuildConfig
import com.example.mygithubuser.Data.remote.response.DetailResponse
import com.example.mygithubuser.Data.remote.response.FollowResponse
import com.example.mygithubuser.Data.remote.response.SearchResponse
import retrofit2.http.*

interface ApiService {

    @GET("search/users")
    suspend fun getGithub(
        @Query("q") q: String
    ): SearchResponse

    @GET("users/{login}")
    suspend fun getDetail(
        @Path("login") id: String
    ): DetailResponse


    @GET("users/{login}/followers")
    suspend fun getFollower(
        @Path("login") id: String?
    ): List<FollowResponse>


    @GET("users/{login}/following")
    suspend fun getFollowing(
        @Path("login") username: String?
    ): List<FollowResponse>
}
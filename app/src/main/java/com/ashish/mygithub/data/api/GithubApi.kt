package com.ashish.mygithub.data.api

import com.ashish.mygithub.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface GithubApi {


    @GET("/repos/:owner/:repo")
    suspend fun getGithubRepo(
        @Query("owner") owner : String ,
        @Query("repo") repo : String ,
    ) : GithubRepoResponse
}
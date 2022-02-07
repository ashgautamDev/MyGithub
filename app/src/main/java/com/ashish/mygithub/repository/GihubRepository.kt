package com.ashish.mygithub.repository

import com.ashish.mygithub.data.api.GithubApi
import com.ashish.mygithub.data.api.GithubRepoResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GithubRepository @Inject constructor(private val githubApi: GithubApi) {

    suspend fun getGithubRepo(ownerName: String, repoName: String):
            Flow<GithubRepoResponse> {
        return flow {
            val response = githubApi.getGithubRepo(ownerName, repoName)
            emit(response)
        }.flowOn(Dispatchers.IO)
    }

}
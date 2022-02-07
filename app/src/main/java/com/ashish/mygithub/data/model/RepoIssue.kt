package com.ashish.mygithub.data.model

data class RepoIssue(
    val title : String ,
    val user : User
)

data class User(
    val name : String ,
    val avatar_url : String
)
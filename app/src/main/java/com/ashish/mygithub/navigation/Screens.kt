package com.ashish.mygithub.navigation

sealed class Screens(val route : String){

    object StarterScreen : Screens("starter")
    object AddRepoScreen : Screens("addRepo")
    object RepoListScreen : Screens("repoList")
    object RepoDetailScreen : Screens("repoDetail")
    object CommitsScreen : Screens("commits")
}

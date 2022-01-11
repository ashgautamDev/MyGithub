package com.ashish.mygithub.screens.reposcreen

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.ashish.mygithub.components.TopBarCommits

@Composable
fun CommitScreen() {

    val branchName = "master"
    Scaffold(
        topBar = { TopBarCommits(branchName)} ,
        content = { CommitLists()}
    )

}

@Composable
fun CommitLists() {



}
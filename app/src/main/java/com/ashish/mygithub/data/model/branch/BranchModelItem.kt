package com.ashish.mygithub.data.model.branch

data class BranchModelItem(
    val commit: Commit,
    val name: String,
    val `protected`: Boolean
)
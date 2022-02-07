package com.ashish.mygithub.data.model.commit

data class CommitModelItem(
    val author: Author,
    val comments_url: String,
    val commit: Commit,
    val committer: CommitterX,
    val html_url: String,
    val node_id: String,
    val parents: List<Any>,
    val sha: String,
    val url: String
)
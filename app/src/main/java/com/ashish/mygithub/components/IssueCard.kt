package com.ashish.mygithub.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ashish.mygithub.utils.LoadingNetworkImage

@Composable
fun IssueCard() {
    val issueTitle = "Unable to Setup Date Picker in Composable"
    val avatarUrl = "https://avatars.githubusercontent.com/u/56464485?s=400&u=74748877788b0024c4fa9d39e25787022dfd3f72&v=4"
    val creatorName = "Ashish Gautam "
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = issueTitle, fontWeight = FontWeight.Bold, fontSize = 24.sp , maxLines = 2)
      IssueCreator(avatar = avatarUrl, creatorName = creatorName)

    }

}

@Composable
fun IssueCreator(avatar: String, creatorName: String) {
    Row() {
        LoadingNetworkImage(url = avatar)
        Text(text = creatorName, fontWeight = FontWeight.Bold, fontSize = 18.sp)

    }

}
package com.ashish.mygithub.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommitCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    , verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceAround) {
            Text(text = "Date", fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
            CommitCode(text = "asdVdf")
        }
        Text(text = "Date", fontWeight = FontWeight.SemiBold, fontSize = 24.sp, maxLines = 3)
        Spacer(modifier = Modifier.height(4.dp))
        IssueCreator(avatar = "", creatorName = "")


    }

}

@Composable
fun TopBarCommits(branchName: String) {
    TopAppBar(
        title = { CommitTitle(branchName = branchName)},
        backgroundColor = Color.Black
    )
}

@Composable
fun CommitTitle(branchName : String) {
    Column() {
    Text(text = "Commits", fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
    Text(text = branchName, fontWeight = FontWeight.SemiBold)

    }



}
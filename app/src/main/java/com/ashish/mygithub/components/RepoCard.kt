package com.ashish.mygithub.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RepoCard() {

    val repoName = "myRepository"
    val repoDesc = "kjsdoifj sdfoia lwf dfkjnosidfa isdofiasdf;asiodf[awuoefhawe;f dfwefnufvnvh"

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)) {
        Row(modifier = Modifier.fillMaxWidth().padding(8.dp) , horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically) {
            Column() {
                Text(text = repoName , fontSize = 24.sp , fontWeight = FontWeight.Bold )
                Text(text = repoDesc , fontSize = 24.sp , fontWeight = FontWeight.Normal )

            }
            Icon(imageVector = Icons.Default.Send, contentDescription = "null")

        }
        Divider()
    }

}
package com.ashish.mygithub.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun HomeTitleBar(title: String = "Github Browser") {
    TopAppBar(
        title = { title },
        actions = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)

            }
        } ,
        backgroundColor = Color.Black
    )

}
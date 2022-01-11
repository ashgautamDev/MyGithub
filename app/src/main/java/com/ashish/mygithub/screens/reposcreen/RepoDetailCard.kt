package com.ashish.mygithub.screens.reposcreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashish.mygithub.R

@Composable
fun RepoDetailCard() {

    Column(modifier = Modifier.fillMaxWidth()) {
        TopBar()
        RepoDetails("" , "")
        RepoContent()

    }



}

@Composable
fun RepoContent() {

}

@Composable
fun RepoDetails(repoName : String , repoDesc : String) {
 Column(modifier = Modifier
     .fillMaxWidth()
     .padding(start = 24.dp)) {
     Text(text = repoName , fontSize = 24.sp , fontWeight = FontWeight.SemiBold)
     Spacer(modifier = Modifier.height(4.dp))
     Text(text = repoDesc , fontSize = 24.sp , fontWeight = FontWeight.Normal, maxLines = 2 , overflow = TextOverflow.Clip , )


 }
}

@Composable
fun TopBar() {
    TopAppBar(
        title = { "Details" },
        navigationIcon = { Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")},
        actions = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Default.Delete, contentDescription = null)

            }
            IconButton(onClick = { // Todo("Naviagte to web page)
                 }) {
                Icon(painter = painterResource(id =R.drawable.ic_eye), contentDescription = null)

            }
        } ,
        backgroundColor = Color.Black
    )
}

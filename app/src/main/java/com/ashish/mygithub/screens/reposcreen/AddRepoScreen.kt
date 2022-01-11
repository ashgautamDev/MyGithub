package com.ashish.mygithub.screens.reposcreen

import android.icu.text.CaseMap
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddRepoScreen(onClick : () ->Unit) {
    Scaffold(
        topBar = {

            TopAppBar(
                title = {"Add Repo"},
               navigationIcon = { Icons.Default.ArrowBack }
            )
        },
        content = {
            Credentials(ownerName = "", repoName = "")

        } ,
        bottomBar = {
            Button(onClick = { onClick() } ,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = MaterialTheme.colors.primary,
                        shape = RoundedCornerShape(36.dp)
                    ))
            {
                Text(text = "Add Repo" , style = TextStyle(fontWeight = FontWeight.Bold ) , color = MaterialTheme.colors.onPrimary)


            }
        }
    )

}

@Composable
fun Credentials(ownerName: String, repoName: String) {
    var ownerId by remember { mutableStateOf(ownerName) }
    var repoName by remember { mutableStateOf(repoName) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp), verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Owner/Organisation", fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
        TextField(value = ownerId, onValueChange = { ownerId = it })
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Repo Name", fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
        TextField(value = repoName, onValueChange = { repoName = it })
    }

}
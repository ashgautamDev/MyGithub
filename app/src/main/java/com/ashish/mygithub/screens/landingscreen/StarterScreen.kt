package com.ashish.mygithub.screens.landingscreen

import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashish.mygithub.components.RepoCard
import com.ashish.mygithub.navigation.Screens
import com.ashish.mygithub.utils.GithubRepoState
import com.ashish.mygithub.viewmodles.MainViewModel

@Composable
fun StarterScreen(navController: NavController, viewModel: MainViewModel) {

    Scaffold(
        topBar = {

            TopAppBar(
                title = { Text(text = "Add Repo") },
                actions = {
                    IconButton(onClick = { navController.navigate(Screens.AddRepoScreen.route) }) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = null)

                    }
                }
            )
        },
        content = {
            MainContent(viewModel, navController)
        }
    )


}

@Composable
fun MainContent(viewModel: MainViewModel, navController: NavController) {

    val context = LocalContext.current
    viewModel.getGithubRepo("ashgautamDev" , "Image-Stockes")
    when (val result = viewModel.startingState.collectAsState().value) {
        is GithubRepoState.Success -> {
            RepoCard(repoName = result.result.result.userRepo.name, repoDesc = result.result.result.userRepo.description)
        }
        is GithubRepoState.Error -> {
            Toast.makeText(
                context,
                "Error ${result.exception}",
                Toast.LENGTH_SHORT
            ).show()
        }
        is GithubRepoState.Empty -> {
            AddNowButton(navController)
        }
        is GithubRepoState.Loading -> {
            Text(text = "We are fetching data form server " , modifier = Modifier.fillMaxSize()  , textAlign = TextAlign.Center)
        }


    }

}

@Composable
fun AddNowButton(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Track your favourite repo")
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .size(width = 250.dp, height = 56.dp)
                .border(2.dp, color = Color.Black)
                .clickable { navController.navigate(Screens.AddRepoScreen.route) }
        ) {
            Text(text = "Add Repo", fontSize = 24.sp)

        }
    }
}

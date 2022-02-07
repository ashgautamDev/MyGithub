package com.ashish.mygithub

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ashish.mygithub.navigation.NavGraph
import com.ashish.mygithub.ui.theme.MyGithubTheme
import com.ashish.mygithub.viewmodles.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val msg = viewModel.startingState.value
        Log.d("TAG", "onCreate:${msg} ")
        setContent {
            MyGithubTheme {
                NavGraph(viewModel)

            }
        }
    }
}


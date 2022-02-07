package com.ashish.mygithub.viewmodles

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ashish.mygithub.repository.GithubRepository
import com.ashish.mygithub.utils.GithubRepoState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: GithubRepository) : ViewModel() {

    private val _startingState = MutableStateFlow<GithubRepoState>(GithubRepoState.Empty)
    val startingState = _startingState.asStateFlow()


    fun getGithubRepo(ownerName: String , repoName: String) {
        viewModelScope.launch {
            repository.getGithubRepo(ownerName, repoName)
                .catch { e ->
                    _startingState.value = GithubRepoState.Error(e)

                }
                .collect{
                    _startingState.value = GithubRepoState.Success(it)

                }
        }
    }


}



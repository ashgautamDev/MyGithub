package com.ashish.mygithub.data.prefrence


import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.preferencesDataStoreFile
import kotlinx.coroutines.flow.Flow
import javax.inject.Singleton


//
//abstract class PrefsDataStore(context: Context, fileName: String) {
//    private val Context.dataStore by preferencesDataStore(fileName)
//    val mDataStore: DataStore<Preferences> = context.dataStore
//}
//
//private suspend fun updateOwnerName(ownerName : String){
//
//}
//
//@Singleton
//interface RepoImpl {
//    val ownerName : Flow<String>
//    val repoName : Flow<String>
//    suspend fun saveToDataStore(owner: String , repo : String)
//}
//
//object PreferenceKeys {
//    val OWNER_NAME = preferencesKey<String>("user_name")
//    val REPO_NAME = preferencesKey<Int>("user_id")
//}

class RepoManager(context: Context){
    private val Context.dataStore by preferencesDataStore("github_repo")


    companion object {
        val OWNER_NAME = stringPreferencesKey("owner_name")
        val REPO_NAME = stringPreferencesKey("repo_name")
    }

    suspend fun updateUser(owner : String , repo : String){

    }
}
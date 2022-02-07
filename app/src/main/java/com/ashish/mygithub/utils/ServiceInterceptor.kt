package com.ashish.mygithub.utils

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

class ServiceInterceptor(id : String , token : String) : Interceptor {
    private val credentials = Credentials.basic(id , token)



    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()


        val authenticationRequest = request.newBuilder()
            .header("Authorization" , credentials)
                    .build()
        return chain.proceed(authenticationRequest)
    }

}
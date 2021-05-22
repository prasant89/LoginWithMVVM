package com.example.mvvmloginwithtokenretrofit.data.ui.auth.ui.auth

import androidx.lifecycle.LiveData

interface AuthListener {
    fun onStarted()
    fun onSucess(loginResponce: LiveData<String>)
    fun  onFailure(message:String)
}
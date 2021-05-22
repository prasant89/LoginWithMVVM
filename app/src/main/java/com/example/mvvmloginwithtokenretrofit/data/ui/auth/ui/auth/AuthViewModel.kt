package com.example.mvvmloginwithtokenretrofit.data.ui.auth.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmloginwithtokenretrofit.data.ui.auth.data.reposetories.network.UserRepository

class AuthViewModel : ViewModel() {
    var email: String? = null
    var password: String? = null
    var authListener: AuthListener? = null
    fun onLoginButtonClick(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid Email or Password")
            return
        } else {
            val loginResponce = UserRepository().userLogin(email!!,password!!)
            authListener?.onSucess(loginResponce)
        }


    }
}
package com.example.mvvmloginwithtokenretrofit.data.ui.auth.data.reposetories.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserRepository {

    fun userLogin(user: String, password: String): LiveData<String> {
        val loginResponce = MutableLiveData<String>()
        MyApi().userLogin().enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                if (response.isSuccessful) {
                    loginResponce.value = response.body()?.string()
                } else {
                    loginResponce.value = response.errorBody()?.string()

                }
            }
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                loginResponce.value = t.message
            }
        })
        return loginResponce
    }
}
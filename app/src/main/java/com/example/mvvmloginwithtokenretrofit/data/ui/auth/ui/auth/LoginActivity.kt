package com.example.mvvmloginwithtokenretrofit.data.ui.auth.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmloginwithtokenretrofit.R
import com.example.mvvmloginwithtokenretrofit.data.ui.auth.util.hide
import com.example.mvvmloginwithtokenretrofit.data.ui.auth.util.show
import com.example.mvvmloginwithtokenretrofit.data.ui.auth.util.toast
import com.example.mvvmloginwithtokenretrofit.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBind: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        dataBind.viewModel = viewModel
        viewModel.authListener = this
    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSucess(loginResponce: LiveData<String>) {
        loginResponce.observe(this, Observer {
            toast(it)
            progress_bar.hide()
        })
    }

    override fun onFailure(message: String) {
        toast(message)
        progress_bar.hide()
    }
}
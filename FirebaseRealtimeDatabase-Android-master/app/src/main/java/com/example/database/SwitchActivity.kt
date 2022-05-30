package com.example.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.database.R
import android.content.Intent
import android.view.View
import com.example.database.SignInActivity

class SwitchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)
    }

    fun gotoLogin(view: View?) {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}
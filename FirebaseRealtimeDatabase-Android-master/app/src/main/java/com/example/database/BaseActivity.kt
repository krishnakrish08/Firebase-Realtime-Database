package com.example.database

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.ProgressBar
import com.google.firebase.auth.FirebaseAuth

open class BaseActivity : AppCompatActivity() {

    private var mProgressBar: ProgressBar? = null

    fun showProgressDialog() {
        if (mProgressBar == null) {
            mProgressBar = ProgressBar(this)
            mProgressBar?.isIndeterminate = true
            mProgressBar?.visibility = View.VISIBLE
        }
    }

    fun hideProgressDialog() {
        mProgressBar?.visibility = View.GONE
    }

    val uid: String
        get() = FirebaseAuth.getInstance().currentUser!!.uid
}
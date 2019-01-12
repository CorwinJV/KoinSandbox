package com.application.corwinjv.koinsandbox.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.application.corwinjv.koinsandbox.R
import com.application.corwinjv.koinsandbox.koin.MySimplePresenter
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val firstPresenter : MySimplePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.helloText).text = firstPresenter.sayHello()
    }
}

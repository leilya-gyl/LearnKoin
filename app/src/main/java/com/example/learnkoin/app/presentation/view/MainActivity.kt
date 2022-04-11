package com.example.learnkoin.app.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.learnkoin.R
import com.example.learnkoin.app.di.components.MySimplePresenter
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    // Lazy injected MySimplePresenter
    val firstPresenter: MySimplePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "MySimpleActivity"
        findViewById<TextView>(R.id.textView).text = firstPresenter.sayHello()
    }
}
package com.example.learnkoin.app.presentation.view

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.learnkoin.R
import com.example.learnkoin.app.presentation.viewmodel.MyViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MyViewModelActivity : AppCompatActivity() {

    // lazy Inject ViewModel
    private val myViewModel : MyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "MyViewModelActivity"
        findViewById<TextView>(R.id.textView).text = myViewModel.sayHello()
    }
}
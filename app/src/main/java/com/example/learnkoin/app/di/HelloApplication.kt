package com.example.learnkoin.app.di

import android.util.Log
import com.example.learnkoin.domain.service.HelloService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HelloApplication : KoinComponent {

    // Inject HelloService
    private val helloService by inject<HelloService>()

    // Display our data
    fun sayHello() = Log.d("KOIN", helloService.hello())
}
package com.example.learnkoin.app.core

import android.app.Application
import com.example.learnkoin.BuildConfig
import com.example.learnkoin.app.di.HelloApplication
import com.example.learnkoin.app.di.helloModule
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App :Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            printLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            modules(helloModule)
        }

        HelloApplication().sayHello()
    }
}
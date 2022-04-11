package com.example.learnkoin.app.core

import android.app.Application
import com.example.learnkoin.BuildConfig
import com.example.learnkoin.app.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.ksp.generated.module

class HelloApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@HelloApplication)
            modules(AppModule().module)
        }
    }
}
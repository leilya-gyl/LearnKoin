package com.example.learnkoin.app.di

import com.example.learnkoin.data.service.HelloServiceImpl
import com.example.learnkoin.domain.models.HelloMessageData
import com.example.learnkoin.domain.service.HelloService
import org.koin.dsl.module

val helloModule = module {
    single { HelloMessageData() }
    single { HelloServiceImpl(get()) as HelloService }
}
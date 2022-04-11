package com.example.learnkoin.app.di

import com.example.learnkoin.app.di.components.MySimplePresenter
import com.example.learnkoin.data.repository.HelloRepositoryImpl
import com.example.learnkoin.domain.repository.HelloRepository
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.dsl.module

@Module
@ComponentScan("com.example.learnKoin")
class AppModule
//val appModule = module {
//    // single instance of HelloRepository
//    single<HelloRepository> { HelloRepositoryImpl() }
//
//    // simple Presenter Factory
//    factory { MySimplePresenter(get()) }
//}
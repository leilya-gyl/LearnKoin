package com.example.learnkoin.app.di

import com.example.learnkoin.app.di.components.MySimplePresenter
import com.example.learnkoin.app.presentation.viewmodel.MyViewModel
import com.example.learnkoin.data.repository.HelloRepositoryImpl
import com.example.learnkoin.domain.repository.HelloRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // MyViewModel ViewModel
    viewModel { MyViewModel(get()) }
}
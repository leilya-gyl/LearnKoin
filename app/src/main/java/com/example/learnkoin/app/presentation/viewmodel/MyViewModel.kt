package com.example.learnkoin.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.learnkoin.domain.repository.HelloRepository
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class MyViewModel(private val repo : HelloRepository) : ViewModel() {
    fun sayHello() = "${repo.giveHello()} from $this"
}
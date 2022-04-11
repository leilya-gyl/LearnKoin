package com.example.learnkoin.app.di.components

import com.example.learnkoin.domain.repository.HelloRepository
import org.koin.core.annotation.Factory

@Factory
class MySimplePresenter(private val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()} from MySimplePresenter"
}
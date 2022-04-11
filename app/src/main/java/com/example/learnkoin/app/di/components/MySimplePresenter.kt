package com.example.learnkoin.app.di.components

import com.example.learnkoin.domain.repository.HelloRepository

class MySimplePresenter(private val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()} from MySimplePresenter"
}
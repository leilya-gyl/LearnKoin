package com.example.learnkoin.data.repository

import com.example.learnkoin.domain.repository.HelloRepository

class HelloRepositoryImpl() : HelloRepository {
    override fun giveHello() = "Hello Koin"
}
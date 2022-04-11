package com.example.learnkoin.data.repository

import com.example.learnkoin.domain.repository.HelloRepository
import org.koin.core.annotation.Single

@Single
class HelloRepositoryImpl() : HelloRepository {
    override fun giveHello() = "Hello Koin"
}
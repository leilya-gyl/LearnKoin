package com.example.learnkoin.data.service

import com.example.learnkoin.domain.models.HelloMessageData
import com.example.learnkoin.domain.service.HelloService

class HelloServiceImpl(private val helloMessageData: HelloMessageData) : HelloService {
    override fun hello(): String {
        return "Hey, ${helloMessageData.message}"
    }
}
package com.example.learnkoin.domain.models

interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}
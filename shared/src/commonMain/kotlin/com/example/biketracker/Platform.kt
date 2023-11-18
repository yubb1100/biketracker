package com.example.biketracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
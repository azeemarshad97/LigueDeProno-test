package com.example.liguedeprono

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
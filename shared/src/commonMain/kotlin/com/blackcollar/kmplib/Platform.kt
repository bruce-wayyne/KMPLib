package com.blackcollar.kmplib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
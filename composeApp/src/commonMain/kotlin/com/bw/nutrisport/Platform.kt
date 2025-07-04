package com.bw.nutrisport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
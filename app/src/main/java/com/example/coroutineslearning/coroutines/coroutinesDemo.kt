package com.example.coroutineslearning.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking


fun main() = runBlocking{
    println("main starts")
    joinAll(
        async { coRoutines(1,500) },
        async { coRoutines(2,300) }
    )
}

suspend fun coRoutines(num: Int, delay:Long){
    println("routine $num starts")
    delay(delay)
    println("routine $num ends")
}
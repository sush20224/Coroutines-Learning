package com.example.coroutineslearning.coroutines

fun main(){
    println("main starts")
    routines(1,500)
    routines(2,300)
}

fun routines(num: Int, delay:Long){
    println("routine $num starts")
    Thread.sleep(delay)
    println("routine $num ends")
}
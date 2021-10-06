package com.kotlin.wormupweek2day4

class Casual (var daily: String, var wags: Int,speed :Double, code: Int, name:String): Typist(speed, code, name){

    override fun printinfo() {
        super.printinfo()
        println(daily)
        println(wags)
    }
}

package com.kotlin.wormupweek2day4

open class Typist (var speed :Double, code: Int, name:String ): Staff(code, name){

    override fun printinfo() {
        println("about Typist")
        super.printinfo()
        println(speed)
    }
}

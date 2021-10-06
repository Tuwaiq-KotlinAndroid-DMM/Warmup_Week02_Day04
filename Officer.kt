package com.kotlin.wormupweek2day4

class Officer (var grade: String,code: Int, name:String): Staff(code, name){

    override fun printinfo() {
        println("about Officer")
        super.printinfo()
        println(grade)
    }
}
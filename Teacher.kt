package com.kotlin.wormupweek2day4

class Teacher(var Subject: String, var Publication: String, code: Int, name: String,)  : Staff(code, name){

    override fun printinfo() {

        println("about teacher")
        super.printinfo()

        println(Subject)
        println(Publication)
    }


}

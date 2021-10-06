package com.kotlin.wormupweek2day4

fun main(){

  var tec = Teacher("programming with kotlin","Tata McGraw Hill",420, "Ataur")
  var office= Officer("First Class",222,"Md. Rashed")
  var reg = Regular(85.5,333, "Robiul Awal")
  var casu= Casual("yes",10000,78.900002, 333,"kawser ahmad")


  tec.printinfo()
  office.printinfo()
  reg.printinfo()
  casu.printinfo()
}
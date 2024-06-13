package com.loci.kiosk

class Burger(name:String, price:Int) {
    val _name = name
    val _price = price

    fun displayInfo(){
        println("${_price}원의 ${_name} 선택됨")
    }
}
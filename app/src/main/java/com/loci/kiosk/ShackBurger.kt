package com.loci.kiosk

class ShackBurger(input1: String, input2: Int) : Burger() {
    init {
        name = input1
        price = input2
    }

    override fun displayInfo() {
        println("${name}원의 ${price} 선택됨")
    }

    fun shackFunction1() {

    }
}
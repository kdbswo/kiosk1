package com.loci.kiosk

class ShackBeer(input1: String, input2: Int) : Burger() {
    init {
        name = input1
        price = input2
    }
    override fun displayInfo() {
        println("${price}원의 ${name} 선택됨")
    }

    fun shackFunction1() {

    }

}
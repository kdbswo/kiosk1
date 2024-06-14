package com.loci.kiosk

class ShackForzenCustard(name: String, price: Int) : Burger() {
    private val _name = name
    private val _price = price
    override fun displayInfo() {
        println("${_price}원의 ${_name} 선택됨")
    }
    fun shackFunction1(){

    }
}
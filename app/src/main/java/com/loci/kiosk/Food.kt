package com.loci.kiosk

open class Food {
    var name: String = ""
    var price: Int = 0

    open fun displayInfo(){
        println("[SHAKESHACK MENU]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("0. 종료            | 프로그램 종료")
    }

    fun compareMoney(money: Int){
        if (money >= price){
            println("${name}을 구매하기 위한 잔액이 충분합니다.")
        } else {
            println("${name}을 구매하기 위한 잔액이 ${price - money}원 부족합니다.")
        }
    }
}
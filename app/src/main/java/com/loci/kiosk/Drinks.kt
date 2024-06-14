package com.loci.kiosk

open class Drinks: Food() {
    override fun displayInfo() {
        println("[ Frozen Custard MENU ]")
        println("1. Drinks1  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 Frozen Custard")
        println("2. Drinks2  | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 Frozen Custard")
        println("3. Drinks3  | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 Frozen Custard")
        println("4. Drinks4  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 Frozen Custard")
        println("5. Drinks5  | W 5.4 | 비프패티를 기반으로 야채가 들어간 Frozen Custard")
        println("0. 뒤로가기   | 뒤로가기")    }
}
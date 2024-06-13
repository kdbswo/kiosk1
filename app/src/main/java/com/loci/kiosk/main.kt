package com.loci.kiosk

fun main() {
    while (true) {

        println("[SHAKESHACK MENU]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("0. 종료            | 프로그램 종료")

        try {

            val input = readln().toInt()
            when (input) {
                0 -> {
                    println("프로그램 종료")
                    break
                }

                1 -> {
                    while (true) {

                        println("[ Burgers MENU ]")
                        println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                        println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
                        println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
                        println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
                        println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
                        println("0. 뒤로가기        | 뒤로가기")

                        try {
                            val input1 = readln().toInt()
                            if (input1 == 0) {
                                break
                            } else {
                                println("되돌아가기는 0번 입니다.")
                            }
                        } catch (e: NumberFormatException) {
                            println("유효한 숫자를 입력해 주세요")
                        }
                    }
                }

                2 -> {
                    while (true) {

                        println("[ Frozen Custard MENU ]")
                        println("1. Frozen Custard1   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 Frozen Custard")
                        println("2. Frozen Custard2  | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 Frozen Custard")
                        println("3. Frozen Custard3  | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 Frozen Custard")
                        println("4. Frozen Custard4  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 Frozen Custard")
                        println("5. Frozen Custard5  | W 5.4 | 비프패티를 기반으로 야채가 들어간 Frozen Custard")
                        println("0. 뒤로가기        | 뒤로가기")

                        try {
                            val input1 = readln().toInt()
                            if (input1 == 0) {
                                break
                            } else {
                                println("되돌아가기는 0번 입니다.")
                            }
                        } catch (e: NumberFormatException) {
                            println("유효한 숫자를 입력해 주세요")
                        }
                    }
                }
                3 -> {
                    while (true) {

                        println("[ Drinks MENU ]")
                        println("1. Drinks1  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 Drinks")
                        println("2. Drinks2  | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 Drinks")
                        println("3. Drinks3  | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 Drinks")
                        println("4. Drinks4  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 Drinks")
                        println("5. Drinks5  | W 5.4 | 비프패티를 기반으로 야채가 들어간 Drinks")
                        println("0. 뒤로가기   | 뒤로가기")

                        try {
                            val input1 = readln().toInt()
                            if (input1 == 0) {
                                break
                            } else {
                                println("되돌아가기는 0번 입니다.")
                            }
                        } catch (e: NumberFormatException) {
                            println("유효한 숫자를 입력해 주세요")
                        }
                    }
                }
                4 -> {
                    while (true) {

                        println("[ Beer MENU ]")
                        println("1. Beer1   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 Beer")
                        println("2. Beer2   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 Beer")
                        println("3. Beer3   | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 Beer")
                        println("4. Beer4   | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 Beer")
                        println("5. Beer5   | W 5.4 | 비프패티를 기반으로 야채가 들어간 Beer")
                        println("0. 뒤로가기  | 뒤로가기")

                        try {
                            val input1 = readln().toInt()
                            if (input1 == 0) {
                                break
                            } else {
                                println("되돌아가기는 0번 입니다.")
                            }
                        } catch (e: NumberFormatException) {
                            println("유효한 숫자를 입력해 주세요")
                        }
                    }
                }
                else -> println("유효한 숫자를 입력해주세요")
            }
        } catch (e: NumberFormatException) {
            println("유효한 숫자를 입력해주세요")
        }
    }


}
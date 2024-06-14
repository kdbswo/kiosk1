package com.loci.kiosk

var menuList = ArrayList<Food>()

fun main() {
    init()
    var inputMoney = 0

    try {
        while (true) {
            println("소지한 금액을 입력해주세요")

            inputMoney = readln().toInt()

            if (inputMoney < 0 || inputMoney > 1000000) {
                println("0이상 1000000이하의 금액을 입력해주세요")
                continue
            }

            println("입력 금액: ${inputMoney}원")
            break
        }
    } catch (e: NumberFormatException){
        println("0이상 1000000이하의 숫자를 입력해주세용")
    }

    while (true) {

        menuList[0].displayInfo()

        try {

            println("메뉴를 입력해주세요")
            val input = readln().toInt()

            when (input) {
                0 -> {
                    println("프로그램 종료")
                    break
                }

                1 -> {
                    while (true) {

                        menuList[1].displayInfo()

                        try {
                            val input1 = readln().toInt()

                            when (input1) {
                                0 -> break
                                1 -> {
                                    menuList[5].displayInfo()
                                    menuList[5].compareMoney(inputMoney)

                                }

                                2 -> {
                                    menuList[6].displayInfo()
                                    menuList[6].compareMoney(inputMoney)

                                }

                                3 -> {
                                    menuList[7].displayInfo()
                                    menuList[7].compareMoney(inputMoney)

                                }

                                4 -> {
                                    menuList[8].displayInfo()
                                    menuList[8].compareMoney(inputMoney)

                                }

                                5 -> {
                                    menuList[9].displayInfo()
                                    menuList[9].compareMoney(inputMoney)

                                }

                                else -> println("유효한 숫자를 입력해 주세요.")
                            }

                        } catch (e: NumberFormatException) {
                            println("유효한 숫자를 입력해 주세요")
                        }

                    }
                }

                2 -> {
                    while (true) {

                        menuList[2].displayInfo()

                        try {
                            val input1 = readln().toInt()

                            when (input1) {
                                0 -> break
                                1 -> {
                                    menuList[10].displayInfo()
                                    menuList[10].compareMoney(inputMoney)

                                }

                                2 -> {
                                    menuList[11].displayInfo()
                                    menuList[11].compareMoney(inputMoney)

                                }

                                3 -> {
                                    menuList[12].displayInfo()
                                    menuList[12].compareMoney(inputMoney)

                                }

                                4 -> {
                                    menuList[13].displayInfo()
                                    menuList[13].compareMoney(inputMoney)

                                }

                                5 -> {
                                    menuList[14].displayInfo()
                                    menuList[14].compareMoney(inputMoney)

                                }

                                else -> println("유효한 숫자를 입력해 주세요")
                            }

                        } catch (e: NumberFormatException) {
                            println("유효한 숫자를 입력해 주세요")
                        }

                    }
                }

                3 -> {
                    while (true) {

                        menuList[3].displayInfo()


                        try {
                            val input1 = readln().toInt()

                            when (input1) {
                                0 -> break
                                1 -> {
                                    menuList[15].displayInfo()
                                    menuList[15].compareMoney(inputMoney)

                                }

                                2 -> {
                                    menuList[16].displayInfo()
                                    menuList[16].compareMoney(inputMoney)

                                }

                                3 -> {
                                    menuList[17].displayInfo()
                                    menuList[17].compareMoney(inputMoney)

                                }

                                4 -> {
                                    menuList[18].displayInfo()
                                    menuList[18].compareMoney(inputMoney)

                                }

                                5 -> {
                                    menuList[19].displayInfo()
                                    menuList[19].compareMoney(inputMoney)

                                }

                                else -> println("유효한 숫자를 입력해 주세요")
                            }

                        } catch (e: NumberFormatException) {
                            println("유효한 숫자를 입력해 주세요")
                        }
                    }
                }

                4 -> {
                    while (true) {

                        menuList[4].displayInfo()


                        try {
                            val input1 = readln().toInt()

                            when (input1) {
                                0 -> break
                                1 -> {
                                    menuList[20].displayInfo()
                                    menuList[20].compareMoney(inputMoney)

                                }

                                2 -> {
                                    menuList[21].displayInfo()
                                    menuList[21].compareMoney(inputMoney)

                                }

                                3 -> {
                                    menuList[22].displayInfo()
                                    menuList[22].compareMoney(inputMoney)

                                }

                                4 -> {
                                    menuList[23].displayInfo()
                                    menuList[23].compareMoney(inputMoney)

                                }

                                5 -> {
                                    menuList[24].displayInfo()
                                    menuList[24].compareMoney(inputMoney)

                                }

                                else -> println("유효한 숫자를 입력해 주세요")
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

fun init() {
    menuList.add(Food())
    menuList.add(Burger())
    menuList.add(ForzenCustard())
    menuList.add(Drinks())
    menuList.add(Beer())
    menuList.add(ShackBurger("ShackBurger", 6900))
    menuList.add(ShackBurger("SmokeShack", 8900))
    menuList.add(ShackBurger("Shroom Burger", 9400))
    menuList.add(ShackBurger("Cheeseburger", 6900))
    menuList.add(ShackBurger("Hamburger", 5400))
    menuList.add(ShackForzenCustard("ForzenCustard1", 6900))
    menuList.add(ShackForzenCustard("ForzenCustard2", 8900))
    menuList.add(ShackForzenCustard("ForzenCustard3", 9400))
    menuList.add(ShackForzenCustard("ForzenCustard4", 6900))
    menuList.add(ShackForzenCustard("ForzenCustard5", 5400))
    menuList.add(ShackDrinks("Drinks1", 6900))
    menuList.add(ShackDrinks("Drinks2", 8900))
    menuList.add(ShackDrinks("Drinks3", 9400))
    menuList.add(ShackDrinks("Drinks4", 6900))
    menuList.add(ShackDrinks("Drinks5", 5400))
    menuList.add(ShackBeer("Beer1", 6900))
    menuList.add(ShackBeer("Beer2", 8900))
    menuList.add(ShackBeer("Beer3", 9400))
    menuList.add(ShackBeer("Beer4", 6900))
    menuList.add(ShackBeer("Beer5", 5400))


}





















package com.loci.kiosk

var menuList = ArrayList<Food>()

fun main() {
    init()
    menuList.forEach{
        print(it.name)
        println(it.price)
    }
    while (true) {

        menuList[0].displayInfo()

        try {

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
                                }

                                2 -> {
                                    menuList[6].displayInfo()
                                }

                                3 -> {
                                    menuList[7].displayInfo()

                                }

                                4 -> {
                                    menuList[8].displayInfo()

                                }

                                5 -> {
                                    menuList[9].displayInfo()

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

                                }

                                2 -> {
                                    menuList[11].displayInfo()

                                }

                                3 -> {
                                    menuList[12].displayInfo()

                                }

                                4 -> {
                                    menuList[13].displayInfo()

                                }

                                5 -> {
                                    menuList[14].displayInfo()

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
                                }

                                2 -> {
                                    menuList[16].displayInfo()

                                }

                                3 -> {
                                    menuList[17].displayInfo()

                                }

                                4 -> {
                                    menuList[18].displayInfo()

                                }

                                5 -> {
                                    menuList[19].displayInfo()

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

                                }

                                2 -> {
                                    menuList[21].displayInfo()

                                }

                                3 -> {
                                    menuList[22].displayInfo()

                                }

                                4 -> {
                                    menuList[23].displayInfo()

                                }

                                5 -> {
                                    menuList[24].displayInfo()

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
    menuList.add(ShackBurger("ShackBurger",6900))
    menuList.add(ShackBurger("SmokeShack",8900))
    menuList.add(ShackBurger("Shroom Burger",9400))
    menuList.add(ShackBurger("Cheeseburger",6900))
    menuList.add(ShackBurger("Hamburger",5400))
    menuList.add(ShackForzenCustard("ForzenCustard1",6900))
    menuList.add(ShackForzenCustard("ForzenCustard2",8900))
    menuList.add(ShackForzenCustard("ForzenCustard3",9400))
    menuList.add(ShackForzenCustard("ForzenCustard4",6900))
    menuList.add(ShackForzenCustard("ForzenCustard5",5400))
    menuList.add(ShackDrinks("Drinks1",6900))
    menuList.add(ShackDrinks("Drinks2",8900))
    menuList.add(ShackDrinks("Drinks3",9400))
    menuList.add(ShackDrinks("Drinks4",6900))
    menuList.add(ShackDrinks("Drinks5",5400))
    menuList.add(ShackBeer("Beer1",6900))
    menuList.add(ShackBeer("Beer2",8900))
    menuList.add(ShackBeer("Beer3",9400))
    menuList.add(ShackBeer("Beer4",6900))
    menuList.add(ShackBeer("Beer5",5400))


}





















package com.loci.kiosk

var menuList = ArrayList<Food>()

fun main() {
    init()
    menuList.forEach{
        print(it.name)
        println(it.price)
    }
    while (true) {

        val food = Food()
        food.displayInfo()

        try {

            val input = readln().toInt()
            when (input) {
                0 -> {
                    println("프로그램 종료")
                    break
                }

                1 -> {
                    while (true) {
                        val burger = Burger()
                        burger.displayInfo()

                        try {
                            val input1 = readln().toInt()

                            when (input1) {
                                0 -> break
                                1 -> {
                                    val shackBurger = ShackBurger("ShackBurger", 6900)
                                    shackBurger.displayInfo()
                                }

                                2 -> {
                                    val shackBurger = ShackBurger("SmokeShack", 8900)
                                    shackBurger.displayInfo()
                                }

                                3 -> {
                                    val shackBurger = ShackBurger("Shroom Burger", 9400)
                                    shackBurger.displayInfo()
                                }

                                4 -> {
                                    val shackBurger = ShackBurger("Cheeseburger", 6900)
                                    shackBurger.displayInfo()
                                }

                                5 -> {
                                    val shackBurger = ShackBurger("Hamburger", 5400)
                                    shackBurger.displayInfo()
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

                        val forzenCustard = ForzenCustard()
                        forzenCustard.displayInfo()

                        try {
                            val input1 = readln().toInt()

                            when (input1) {
                                0 -> break
                                1 -> {
                                    val shackForzenCustard =
                                        ShackForzenCustard("Frozen Custard1", 6900)
                                    shackForzenCustard.displayInfo()
                                }

                                2 -> {
                                    val shackForzenCustard =
                                        ShackForzenCustard("Frozen Custard2", 8900)
                                    shackForzenCustard.displayInfo()
                                }

                                3 -> {
                                    val shackForzenCustard =
                                        ShackForzenCustard("Frozen Custard3", 9400)
                                    shackForzenCustard.displayInfo()
                                }

                                4 -> {
                                    val shackForzenCustard =
                                        ShackForzenCustard("Frozen Custard4", 6900)
                                    shackForzenCustard.displayInfo()
                                }

                                5 -> {
                                    val shackForzenCustard =
                                        ShackForzenCustard("Frozen Custard5", 5400)
                                    shackForzenCustard.displayInfo()
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

                        val drinks = Drinks()
                        drinks.displayInfo()

                        try {
                            val input1 = readln().toInt()

                            when (input1) {
                                0 -> break
                                1 -> {
                                    val shackDrinks = ShackDrinks("Drink1", 6900)
                                    shackDrinks.displayInfo()
                                }

                                2 -> {
                                    val shackDrinks = ShackDrinks("Drink2", 8900)
                                    shackDrinks.displayInfo()
                                }

                                3 -> {
                                    val shackDrinks = ShackDrinks("Drink3", 1500)
                                    shackDrinks.displayInfo()
                                }

                                4 -> {
                                    val shackDrinks = ShackDrinks("Drink4", 5600)
                                    shackDrinks.displayInfo()
                                }

                                5 -> {
                                    val shackDrinks = ShackDrinks("Drink5", 7600)
                                    shackDrinks.displayInfo()
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

                        val beer = Beer()
                        beer.displayInfo()

                        try {
                            val input1 = readln().toInt()

                            when (input1) {
                                0 -> break
                                1 -> {
                                    val shackBeer = ShackBeer("Beer1", 6900)
                                    shackBeer.displayInfo()
                                }

                                2 -> {
                                    val shackBeer = ShackBeer("Beer2", 1300)
                                    shackBeer.displayInfo()
                                }

                                3 -> {
                                    val shackBeer = ShackBeer("Beer3", 5300)
                                    shackBeer.displayInfo()
                                }

                                4 -> {
                                    val shackBeer = ShackBeer("Beer4", 2200)
                                    shackBeer.displayInfo()
                                }

                                5 -> {
                                    val shackBeer = ShackBeer("Beer5", 9500)
                                    shackBeer.displayInfo()
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





















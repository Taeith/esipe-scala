package com.td.scala.functional_types._2

import com.td.scala.functional_types._2.constructor.CarConstructor

object Main extends App {

	println("Implement here several kind of searchs")

	val carConstructor = CarConstructor

	println(s"${carConstructor.searchCarById(4).toString}")
	println(s"${carConstructor.searchCarById(4).get.color}")

	val car = carConstructor.searchCarById(14).getOrElse(None)
	if (car != None) println(s"${car.toString}")
	else println("Car has not been found!")

	val list1 = carConstructor.searchCarsByColor(carConstructor.Blue)
	if (list1 != List()) println(s"Total number of places of blue car (must be 0): ${list1.map(x => x.nbPlaces).reduce((x, y) => x + y)}")
	else println("There is no car of this color.")

	val list2 = carConstructor.searchCarsByColor(carConstructor.Blelow)
	if (list2 != List()) println(s"Total number of places of blue car (must be 0): ${list2.map(x => x.nbPlaces).reduce((x, y) => x + y)}")
	else println("There is no car of this color.")

}

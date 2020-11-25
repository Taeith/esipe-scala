package com.td.scala.classes

class Car(nbDoor: Int, var color: String, val nbPlaces: Int, var speed: Int = 0) {

	def speedUp(value: Int) = {
		if (value < 0) throw new IllegalArgumentException("Value must be positive!")
		else speed += value
	}

	def brake(value: Int) = {
		if (value < 0) throw new IllegalArgumentException("Value must be positive!")
		else speed -= value
	}

	override def toString: String = s"($nbDoor, $color, $nbPlaces, $speed)"

}
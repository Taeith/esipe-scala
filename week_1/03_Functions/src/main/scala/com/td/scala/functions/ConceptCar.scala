package com.td.scala.functions

import com.td.scala.functions.constructor.CarConstructor.Color

class ConceptCar(val nbDoor: Int, val color: Color, val nbPlaces: Int, val price: Double = 0.0, val speed: Int = 0, val turbo: Int => Int = identity[Int]) {

  def speedUp(s: Int): Either[String, ConceptCar] = {
    if (s <= 0) Left("")
    else Right(new ConceptCar(this.nbDoor, this.color, this.nbPlaces, this.price, this.turbo(s + speed)))
  }

  def brake(s: Int): Either[String, ConceptCar] = {
    if (s >= 0) Left("")
    else Right(new ConceptCar(this.nbDoor, this.color, this.nbPlaces, this.price, speed + s))
  }

  override def toString: String = s"($nbDoor, $color, $nbPlaces, $speed)"

}

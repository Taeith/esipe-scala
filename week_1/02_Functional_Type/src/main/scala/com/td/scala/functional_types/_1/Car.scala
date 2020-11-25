package com.td.scala.functional_types._1

class Car(val nbDoor: Int, val color: String, val nbPlaces: Int, val speed: Int = 0) {

  def speedUp(value: Int): Either[Car, String] = {
    value match {
      case x if x >= 0 => Left(new Car(nbDoor, color, nbPlaces, speed + value))
      case _ => Right("Value must be positive!")
    }
  }

  def brake(value: Int): Either[Car, String] = {
    value match {
      case value if value > 0 => Left(new Car(nbDoor, color, nbPlaces, speed - value))
      case _ => Right("Value must be positive!")
    }
  }

  override def toString: String = s"($nbDoor, $color, $nbPlaces, $speed)"

}
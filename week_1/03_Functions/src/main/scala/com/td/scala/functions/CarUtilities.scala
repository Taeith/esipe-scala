package com.td.scala.functions

object CarUtilities {

  /** Price mustn't appear, only color, nbDoor, nbPlaces* */
  val technicalFormat: Car => String = car => s"(${car.color}, ${car.nbDoor}, ${car.nbPlaces})"

  /** All caracteristics must me displayed* */
  val showRoomFormat: Car => String = car => s"(${car.color}, ${car.nbDoor}, ${car.nbPlaces}, ${car.speed}, ${car.price})"

  /** Multiply parameter by 10* */
  val maxiTurbo: Int => Int = x => x * 10

  /** Multiply parameter by 2* */
  val softTurbo: Int => Int = x => x * 2

}

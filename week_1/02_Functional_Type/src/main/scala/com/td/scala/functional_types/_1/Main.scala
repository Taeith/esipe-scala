package com.td.scala.functional_types._1

object Main extends App {

  println("Improve the code of the class Car in a functional way")

  val car1 = new Car(3, "white", 4)

  println(car1.color)

  println(s"${car1.speedUp(500).left.get.brake(100).toString}")

}

package com.td.scala.classes

object Main extends App {

  println("Drive your car here")

  val car1 = new Car(4, "Red", 4, 90)
  val car2 = new Car(2, "Orange", 2)
  println(s"Car1 : ${car1.toString}")
  println(s"Car2 : ${car2.toString}")

  car2.speedUp(500)
  car2.brake(150)
  println(s"Car2 : ${car2.toString}")

  car2.speedUp(-1)

}

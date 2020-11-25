package com.td.scala.functions
import com.td.scala.functions.constructor.CarConstructor

object Main extends App {

	val carConstructor = CarConstructor

	println("Prepare characteristic sheets (technical) for all green car")
	var cars = carConstructor.searchCarsByColor(carConstructor.Green)
	if (cars == List()) {
		println("List is empty.")
	} else {
		var sheets = carConstructor.technicalSheet(cars, CarUtilities.technicalFormat)
		sheets.foreach(println)
	}

	println("Prepare characteristic sheets (showroom) for all pink car")
	cars = carConstructor.searchCarsByColor(carConstructor.Pink)
	if (cars == List()) {
		println("List is empty.")
	} else {
		var sheets = carConstructor.technicalSheet(cars, CarUtilities.showRoomFormat)
		sheets.foreach(println)
	}

	println("""Build a concept car that embeded a turbo that make it the faster car in the world
      |when the pilot speed up, its speed rise up by 10 times than standard car
      |""".stripMargin)

	var conceptCar = new ConceptCar(4, carConstructor.Blue, 4, 10000, 100, CarUtilities.maxiTurbo)
	conceptCar = conceptCar.speedUp(100).right.get
	println(conceptCar.toString)


	println("""Build a standard car that embeded a turbo that make it the luxurious car in the world
      |when the driver speed up, its speed rise up by 2 times
      |""".stripMargin)

	var standardCar = new ConceptCar(4, carConstructor.Blue, 4, 10000, 100, CarUtilities.softTurbo)
	standardCar = standardCar.speedUp(100).right.get
	println(standardCar.toString)

}

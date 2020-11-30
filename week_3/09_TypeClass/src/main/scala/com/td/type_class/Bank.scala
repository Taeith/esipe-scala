package com.td.type_class

import com.td.type_class.converter.Converter
import com.td.type_class.converter.converters.EUR_TO_USD
import com.td.type_class.converter.Currency

trait Bank[B] {

  def exchange[A](m: A)(implicit conv: Converter[A, B]): B = conv.change(m)

}

case class GermanBank[EUR]() extends Bank[EUR] {

}

//Create a new bank which able to exchange EURO from
object Main extends App {
	println(s"${GermanBank().exchange(Currency.EUR(100.0))}")
}

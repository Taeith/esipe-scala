package com.td.case_classes

object Main extends App {

	val firefox1: Browser = Browser(1.0, "", Seq("Windows, MacOs, Linux"))
	val opera1: Browser = Browser(0.4, "", Seq("MacOs"))
	val chrome1: Browser = Browser(2.4, "", Seq("Windows, Linux"))
	val chrome2: Browser = Browser(2.4, "", Seq("Windows, Linux"))

	println(s"${firefox1.equals(chrome1)}")
	println(s"${firefox1 == chrome1}")

	println(s"${chrome1.equals(chrome2)}")
	println(s"${chrome1 == chrome2}")

	println(chrome1.toString())
	println(chrome1.addMinorUpdate())
	
}

package com.td.scala.adt._3

import com.td.scala.adt._3.utils.DB
import com.td.scala.adt._3.adt.types.kind._
import com.td.scala.adt._3.adt.types.platform._

object Main extends App {

	println(s"${DB.getBrowser(browser => browser.kind.equals(Firefox))}")
	println(s"${DB.getBrowser(browser => browser.kind.equals(Chrome) && browser.platform.contains(Windows))}")
	println(s"${DB.getBrowser(browser => browser.version == 1.0)}")
	println(s"${DB.getBrowser(browser => browser.kind.equals(Opera) || browser.kind.equals(IE))}")
	println(s"${DB.getBrowser(browser => browser.kind.equals(Chrome) && browser.platform.contains(Linux) && browser.version == 3.4 )}")
}

package com.td.scala.classes

class Browser(val version: Double, val kind: String, val platform: Seq[String]) {

	def addMinorUpdate(): Browser = {
		new Browser(version + 0.1, kind, platform)
	}

	override def equals(browser: Any): Boolean = {
	    browser match {
			case x: Browser => version == x.version && kind.equals(x.kind) && platform.equals(x.platform)
			case _ => false
	    }
	}

	override def toString(): String = {
		s"Browser: ${version} ${kind} ${platform}"
	}
	
}

object Browser {

	def apply(version: Double, kind: String, platform: Seq[String]): Browser = {
		new Browser(version, kind, platform)
	}

}
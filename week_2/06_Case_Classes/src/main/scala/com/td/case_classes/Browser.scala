package com.td.case_classes

case class Browser(version: Double, kind: String,  platform: Seq[String]) {

	def addMinorUpdate(): Browser = {
		copy(version + 0.1, kind, platform)
	}

}
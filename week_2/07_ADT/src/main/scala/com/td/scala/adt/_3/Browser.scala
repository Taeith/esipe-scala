package com.td.scala.adt._3

import com.td.scala.adt._3.adt.types.kind.Kind
import com.td.scala.adt._3.adt.types.platform.Platform

case class Browser(version: Double, kind: Kind, platform: Seq[Platform]) {

	def addMinorUpdate(): Browser = {
		copy(version + 0.1, kind, platform)
	}

}

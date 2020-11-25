package com.td.recursion

object Sum {

  def closedForm(n: Long): Long = (n * (n + 1)) / 2;

  def recursive(n: Long): Long = {
  	n match {
  		case x if x < 1 => 0
  		case _ => recursive(n - 1) + n
  	}
  }

  def tailrecursive(n: Long): Long = if (n == 0) 0 else n + tailrecursive(n - 1)

}

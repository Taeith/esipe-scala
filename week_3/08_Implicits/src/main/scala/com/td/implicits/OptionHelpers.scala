package com.td.implicits

object OptionHelpers {

  // 1: Implement this function
  def naiveAdd(option1: Option[Int], option2: Option[Int]): Option[Int] = {
  	option1 match {
        case Some(value) => Some(value + option2.getOrElse(0))
        case None => None
    }
  }

  // 2: Implement an extension method that adds two Option[Int]
  // 3: Implement a solution to add option and int

	implicit class CustomOption(val option1: Option[Int]) {
	    def plus(option2: Option[Int]): Option[Int] = {
	        naiveAdd(option1, option2)
	    }
	    def +(toAdd: Int): Option[Int] = {
	    	option1 match {
		        case Some(value) => Some(value + toAdd)
		        case None => None
		    }
	    }
	}
	
}
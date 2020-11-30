package com.td.type_class

object converter {

  sealed trait Currency {
    val amount: Double
    val symbol: String
    def display: String =
      s"Montant $amount $symbol"
  }

  object Currency {

    case class EUR(amount: Double) extends Currency {
      override val symbol: String = "€"
    }

    case class USD(amount: Double) extends Currency {
      override val symbol: String = "$"
    }

    case class JPN(amount: Double) extends Currency {
      override val symbol: String = "¥"
    }

    // TODO: Add your own currency
  }

  trait Converter[A, B] {
    def change(amount: A): B
  }

  object converters {
    
    implicit val EUR_TO_USD: Converter[Currency.EUR, Currency.USD] = (eur: Currency.EUR) => Currency.USD(eur.amount * 1.20)
    implicit val USD_TO_EUR: Converter[Currency.USD, Currency.EUR] = (usd: Currency.USD) => Currency.EUR(usd.amount * 0.83)

  }

}

// TODO: Provide implicits converters Currency based on trait converter[A,B]
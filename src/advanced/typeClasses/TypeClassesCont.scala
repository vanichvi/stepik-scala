package advanced.typeClasses

object TypeClassesCont extends App {
  trait Discount {
    def discount(coupon: String) = "coupon applied"

    def discount(percentage: Int) = s"$percentage % discount"
  }

  trait DiscountMagnet {
    def apply(): String
  }

  def discount(magnet: DiscountMagnet): String = magnet()

  implicit class DiscountStr(discount: String) extends DiscountMagnet {
    override def apply(): String = if (discount.charAt(0).isDigit) s"$discount % discount"
    else "coupon applied"
  }

  println(discount("13"))
}


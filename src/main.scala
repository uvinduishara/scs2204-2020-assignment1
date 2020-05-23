object main {

  def main(args:Array[String]):Unit = {

    convertCintoF(35)
    volumeOfSphere(5)
    wholesaleCostCal(60)

  }


  def convertCintoF(deg:Double): Unit = {
    val f :Double = deg * 1.8000 + 32.00
    println( s"Fahrenheit : $f" )
  }

  def volumeOfSphere(radius:Double): Unit = {
    val volume :Double = (4.0/3) * math.Pi * math.pow(radius,3)
    println( s"Volume of sphere is : $volume" )
  }

  def wholesaleCostCal(copies:Int): Unit = {
    val coverPrice :Double = 24.95
    val dis :Double = coverPrice * (40/100)
    val shipCost :Double = if(copies<=50) 3 else 3 + (copies-50) * 0.75
    val wholesalecost :Double = (coverPrice-dis) * copies + shipCost
    println(s"Wholesale Cost is : $wholesalecost" )
  }

}

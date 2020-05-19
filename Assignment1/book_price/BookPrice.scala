object BookPrice extends App{
  
  def bookPrice(copies:Int):Double = 24.95 * copies;

  def bookDiscount(price:Double):Double = price*40/100.0;

  def shippingCost(copies:Int):Double = {
    var cost:Double = 0;
    if(copies>50) cost += (3*50) + (copies-50)*0.75;
    else cost += 3*copies;
    cost;
  }

  val copies = 60;
  val totalCost = bookPrice(copies) + bookDiscount(bookPrice(copies)) + shippingCost(copies);
  println("Total wholesale cost for " + copies +" copies = " + totalCost);
}

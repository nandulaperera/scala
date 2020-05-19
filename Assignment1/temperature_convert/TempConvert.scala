object TempConvert extends App{
  def convertTemp(temp:Double):Double=temp*1.8000+32.00;

  val temp = 35;
  println(temp + "C = " + convertTemp(temp) + "F");
}

object Volume extends App{
  def findVolume(radius:Double):Double=4/3.0*math.Pi*math.pow(radius,3);

  val radius = 5;
  println("Volume of the sphere with radius " + radius + " = " + findVolume(radius));
}

object SubtractRationalNumber extends App{
  var x = new Rational(3,4);
  var y = new Rational(5,8);
  var z = new Rational(2,7);
  println(x + " - " + y + " - " + z + " = " + (x - y - z));
}

class Rational(numer:Int,denom:Int){
  val numerator = if (numer >= 0) numer/gcd(numer,denom) else (numer/gcd(-numer,denom));
  val denominator = if (numer >= 0) denom/gcd(numer,denom) else denom/gcd(-numer,denom);
  def + (r:Rational) = new Rational((this.numerator*r.denominator)+(this.denominator*r.numerator),this.denominator*r.denominator);
  def negative = new Rational(-this.numerator,this.denominator);
  def - (r:Rational) = this + r.negative;
  def gcd(a:Int, b:Int):Int = if(b == 0) a else gcd(b, a%b);
  override def toString: String = this.numerator + "/" +  this.denominator;
}

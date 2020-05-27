object CheckPrime extends App{

  def gcd(x:Int,y:Int):Int = y match{
    case 0 => x;
    case y if y>x => gcd(y,x);
    case _ => gcd(y,x%y);
  }

  def isPrime(n:Int,i:Int = 2):Boolean = i match{
    case x if x == n => true;
    case x if gcd(n,x) > 1 => false;
    case x => isPrime(n,x+1);
  }

  print("Enter number to check whether it is prime or not: ");
  val n = scala.io.StdIn.readInt();
  
  if(isPrime(n)){
    printf("%d is a prime number\n",n);
  }else{
    printf("%d is not a prime number\n",n);
  }
}


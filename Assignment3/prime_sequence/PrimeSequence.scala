object PrimeSequence extends App{

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

  def primeSequence(n:Int):Unit = {
    if(n == 2){
      if(isPrime(n)){
        print(n + " ");
      }
    }else{
      primeSequence(n-1);
      if(isPrime(n)){
        print(n + " ");
      }
    }
  }


  print("Enter number n: ");
  val n = scala.io.StdIn.readInt();
  printf("The prime numbers less than %d are: ",n);
  primeSequence(n);
  println();
}


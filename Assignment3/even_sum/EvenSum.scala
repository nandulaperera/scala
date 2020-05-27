object EvenSum extends App{

  def isEven(n:Int):Boolean = n match{
    case 0 => true;
    case _ => isOdd(n-1);
  }

  def isOdd(n:Int):Boolean = !(isEven(n));

  def evenSum(n:Int):Int = n match{
    case 0 => 0;
    case x if(!isEven(x)) => evenSum(x-1);
    case x if(isEven(x)) => x + evenSum(x-1);
  }
    
  print("Enter number n: ");
  val n = scala.io.StdIn.readInt();
  printf("The addition of all even numbers less than %d is: ",n);
  print(evenSum(n-1));
  println();
}


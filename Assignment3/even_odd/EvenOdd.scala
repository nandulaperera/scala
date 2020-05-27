object EvenOdd extends App{

  def isEven(n:Int):Boolean = n match{
    case 0 => true;
    case _ => isOdd(n-1);
  }

  def isOdd(n:Int):Boolean = !(isEven(n));

  print("Enter number n: ");
  val n = scala.io.StdIn.readInt();
  
  if(isEven(n)){
    printf("%d is even\n",n);
  }else{
    printf("%d is odd\n",n);
  }
}


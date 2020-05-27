object FibonacciSeq extends App{

  def fib(n:Int):Int = n match{
    case 0 => 0;
    case 1 => 1;
    case _ => fib(n-1) + fib(n-2); 
  }

  def printFib(n:Int):Unit = {
    
    if(n == 0){
      print(fib(n) + " ");
    }else{
      printFib(n-1);
      print(fib(n) + " ");
    }
  }

  print("Enter number n: ");
  val n = scala.io.StdIn.readInt();
  printf("The first %d fibonacci numbers are : ",n);
  printFib(n);
  println();
}


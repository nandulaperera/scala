object RecursiveSum extends App{

  def sum(n:Int):Int={
    if(n == 1){
      1
    }else{
      n+sum(n-1);
    }
  }

  print("Enter number n: ");
  val n = scala.io.StdIn.readInt();
  printf("Sum from 1 to %d is: %d\n",n,sum(n));
}

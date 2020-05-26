object TakeHomeSalary extends App{

  def normalSalary(hours:Int):Int = hours * 150;

  def otSalary(hours:Int):Int = hours * 75;

  def totalIncome(normalHours:Int,otHours:Int):Int = normalSalary(normalHours) + otSalary(otHours);

  def tax(income:Double):Double = income * 0.1;

  def takeHomeSalary(normalHours:Int,otHours:Int):Double = totalIncome(normalHours,otHours) - tax(totalIncome(normalHours,otHours));

  println("Enter normal working hours: ");
  val normalHours = scala.io.StdIn.readInt();

  println("Enter OT hours: ");
  val otHours = scala.io.StdIn.readInt();

  printf("Take home salary: Rs.%.2f\n",takeHomeSalary(normalHours,otHours));
}

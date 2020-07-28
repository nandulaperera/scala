object TransferMoney extends App{
  val account1 = new Account("19901541240","10041215201","A.B.C Perera",100000);
  val account2 = new Account("19951041021","20415263489","D.E.F Fernando",140000);
  println("Initial Balances: \n");
  println(account1);
  println(account2);
  account1.transferMoney(account2,15000);
  println("Balances after Transfer: \n");
  println(account1);
  println(account2);
}

class Account(id:String, accountNo:String, name:String, amount:Double){
  val nic = id;
  val accountNumber = accountNo;
  val fullName = name;
  var balance = amount;

  def withdraw(amount: Double) = this.balance -= amount;
  def deposit(amount: Double) = this.balance += amount;
  def transferMoney(bankAccount: Account,amount:Double): Unit ={
    this.withdraw(amount);
    bankAccount.deposit(amount);
  }
  override def toString: String = "NIC: "+this.nic+"\nAccountNumber: "+this.accountNumber+"\nFull Name: "+this.fullName+"\nBalance: "+this.balance+"\n";
}

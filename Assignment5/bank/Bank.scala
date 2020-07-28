object Bank extends App{
  var bank:List[Account] = List();
  bank = bank :+ new Account("19901541240","10041215201","A.B.C Perera",100000);
  bank = bank :+ new Account("19951041021","20415263489","D.E.F Fernando",140000);
  bank = bank :+ new Account("19901541240","18044297151","A.B.C Perera",50000);
  bank = bank :+ new Account("19921482201","40123125146","K.L.M Silva",-500);

  val find = (nic:String,bank:List[Account]) => bank.filter(account=>account.nic.equals(nic));
  val overdraft = (bank:List[Account]) => bank.filter(account=>account.balance<0);
  val totalBankAmount = (bank:List[Account]) => bank.reduce((acc1,acc2)=>acc1+acc2);
  val interest = (bank:List[Account]) => bank.map((account:Account) => if(account.balance<0) new Account(account.nic,account.accountNumber,account.fullName,account.balance+account.balance*0.1) else new Account(account.nic,account.accountNumber,account.fullName,account.balance+account.balance*0.05));

  //Details of all accounts of person with NIC 19901541240
  println("Bank Accounts with NIC 19901541240");
  val allNICAccounts = find("19901541240",bank).toIterator;
  while(allNICAccounts.hasNext){
    println(allNICAccounts.next())
  }

  //Details of all accounts with a bank overdraft
  println("Bank Overdrafts")
  val od = overdraft(bank).toIterator;
  while(od.hasNext){
    println(od.next())
  }

  //Total of all account balances in the bank
  println("Total of all account balances: Rs." + totalBankAmount(bank).balance);

  //Balances of all accounts after adding interest
  println("Balances after adding interest");
  val allAccounts = interest(bank).toIterator;
  while(allAccounts.hasNext){
    println(allAccounts.next())
  }
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
  def + (acc:Account) = new Account("BankID","BankAccount","Bank",this.balance + acc.balance);
  override def toString: String = "NIC: "+this.nic+" - AccountNumber: "+this.accountNumber+" - Full Name: "+this.fullName+" - Balance: Rs."+this.balance;
}

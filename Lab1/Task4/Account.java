class Account
{
	protected double balance; 
	public void deposit(double in_amount)  //deposit method with in_amount perameter for taking input 
	{
		balance+=in_amount;		//adding input amount of deposit to balance variable 
		System.out.println("Your New Balance is Rs:"+balance);
	}
	public void withdraw(double in_amount)	//withdraw method with in_amount perameter for taking input
	{
		balance-=in_amount;		//deducting input amount amount from balance variable
		System.out.println("Your New Balance After Withdraw of Rs:"+in_amount+" is Rs:"+balance);
	}
}
class SavingAccount extends Account		//SavingAccount class that is extending Account class
{
	private double defaultInterestRate;	
	private double interestRate;
	SavingAccount()				//constructor for assinging default value to defaultInterestRate variable
	{
		defaultInterestRate=2.5;
	}
	public void setDefaultInterestrate(double in_rate)	//setDefaultInterestrate method with in_rate perameter 
	{
		defaultInterestRate=in_rate;			//set the in_rate value to DefaultInterestrate
	}
	public void applyMonthlyInterest()			//applyMonthlyInterest method to print monthly Interest
	{
		System.out.println("Monthly Interest is "+((balance*defaultInterestRate)+balance));	//printing Monthly Interest
	}
}
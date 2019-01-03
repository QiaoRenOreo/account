package ss.week7.account;

public class Account { 
	protected double balance = 0.0;

	public Account()
	{ 
		
	}
	public synchronized void transaction(double amount)  {
		while (balance + amount <-1000)
		{
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("");
			}
		}
		balance = balance + amount;
	}
	public double getBalance() {
		return balance;
	}
}

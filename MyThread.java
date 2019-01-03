package ss.week7.account;

public class MyThread extends Thread
{
	private double theAmount;
	private int theFrequency;
	private Account theAccount;
	public MyThread(double amount , int frequency , Account account) 
	//frequency is time
	{
		this.theAmount = amount;
		this. theFrequency = frequency;
		this.theAccount = account;
	}
	public /*synchronized*/ void run()  
	{
			for (int i=0;i<theFrequency;i=i+1)
			{
/*	the following is wrong:
 * 			while (theAccount.getBalance()<-1000)
					wait(); 
because theAccount.getBalance()can never be less than -1000
the actual thing is: 
we forecast that: assume we do transaction(theAmount),
the balance become less than -1000
so the condition checking should be inside the method transaction(theAmount)
*/
				theAccount.transaction(theAmount);
				notifyAll();
			}
	}
	
}

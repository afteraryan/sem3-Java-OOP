class AccountDetails
{
	protected String accType;
	protected int accNumber;
	static final int minBalance = 500;
	protected float CurrBalance;

	public AccountDetails(String Type, int an, int cb) 
	{
		accType = Type;
		accNumber = an;
		CurrBalance = cb;
	}

	public int getAccNum() 
	{
		return accNumber;
	}
	public float getCurBal() 
	{
		return CurrBalance;
	}
	public String getAccType() 
	{
		return accType;
	}

	public void setAccNum(int num) 
	{
		accNumber = num;
	}
	public void setAccType(String s) 
	{
		accType = s;
	}

	public void callInterest() 
	{
		CurrBalance += CurrBalance * 0.2;
	}
}

class FixedDepositAccount extends AccountDetails
{
	int years;
	public FixedDepositAccount(String Type, int an, int cb, int y) 
	{
		super(Type,an,cb);
		years = y;
	}
	public void totalBal() 
	{
		CurrBalance += CurrBalance * 0.1*years;
	}
}

class CurrAccount extends AccountDetails
{
	public CurrAccount(String Type, int an, int cb, int y) 
	{
		super(Type,an,cb);
	}
}

public class Account
{
	public static void main(String args[])
	{
		AccountDetails customer = new AccountDetails("Normal", 99, 1000);
		System.out.println("Account Type: " + customer.getAccType());
		System.out.println("Account Number: " + customer.getAccNum());
		System.out.println("Account Balance: " + customer.getCurBal());
		customer.callInterest();
		System.out.println("Balance with Interest: " + customer.getCurBal());
	}
}
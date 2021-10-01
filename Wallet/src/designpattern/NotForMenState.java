package designpattern;

public class NotForMenState implements State
{

	@Override
	public void walletFor(WalletContext ctx) 
	{
System.out.println("Trifold, Slim Wallet, Card Case Wallet etc.. are not suitable for men");
ctx.setState(this);
	}
	
	public String toString()
	{
		return "Not for men state";
	}
}

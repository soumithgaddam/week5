package designpattern;

public class NotForWomenWalletState implements State
{

	@Override
	public void walletFor(WalletContext ctx) 
	{
System.out.println("Bifold , Hybrid Slim, Money clip Wallets etc.. are suitable form Women");
ctx.setState(this);
	}
	
	public String toString()
	{
		return "Not for women state";
	}
}


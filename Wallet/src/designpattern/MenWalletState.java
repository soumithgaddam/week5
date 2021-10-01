package designpattern;

public class MenWalletState implements State
{

	@Override
	public void walletFor(WalletContext ctx) {
	System.out.println("Mens Wallets : Bifold , Hybrid Slim, Money clip Wallets etc..");
    ctx.setState(this);		
	}
	
	public String toString()
	{
		return "Men Wallet State ";
	}
}

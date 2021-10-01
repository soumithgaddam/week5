package designpattern;

public class WomenWalletState implements State
{
	@Override
	public void walletFor(WalletContext ctx) {
	System.out.println("WomMen Wallets : Trifold, Slim Wallet, Card Case Wallet etc..");
    ctx.setState(this);		
	}
	
	public String toString()
	{
		return "WoMen Wallet State ";
	}
}

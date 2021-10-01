package designpattern;

public class MainProgram {

	public static void main(String[] args) {
		WalletContext wc=new WalletContext();
		MenWalletState men=new MenWalletState();
		men.walletFor(wc);
		System.out.println(wc.getState().toString());
		
		NotForMenState nmen=new NotForMenState();
		nmen.walletFor(wc);
		System.out.println(wc.getState().toString());
		
		WomenWalletState women=new WomenWalletState();
		women.walletFor(wc);
		System.out.println(wc.getState().toString());
		
		NotForWomenWalletState nwomen = new NotForWomenWalletState();
		nwomen.walletFor(wc);
		System.out.println(wc.getState().toString());

	}

}

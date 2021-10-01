package designpattern;
public class WalletContext 
{
	private State wstate;
	
	public void setState(State s)
	{
		wstate = s;
	}
	
	public State getState()
	{
		return wstate;
	}
}

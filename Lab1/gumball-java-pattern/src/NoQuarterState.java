

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter(int coin) {
		System.out.println("You inserted a coin of value : " + coin);
		gumballMachine.setValue(coin);
		if(gumballMachine.price <= gumballMachine.getValue())
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		else
			gumballMachine.setState(gumballMachine.getNoQuarterState());
			//System.out.println("You need more value of : " + (gumballMachine.price - gumballMachine.value));
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a valid Coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no sufficient amount. Please add " +  (gumballMachine.price - gumballMachine.getValue()) + " more and turn the crank");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	}
 
	public String toString() {
		return "waiting for quarter";
	}
}

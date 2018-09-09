

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter(int coin) {
		System.out.println("You inserted a coin of value : " + coin);
		gumballMachine.value = gumballMachine.value + coin;
		if(gumballMachine.price <= gumballMachine.value)
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		else
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		System.out.println("You need more value of : " + (gumballMachine.price - gumballMachine.value));
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	}
	
	public void rejectCoin() {
        System.out.println("Please enter a valid coin. The coin has been ejected");
    }
 
	public String toString() {
		return "waiting for quarter";
	}
}

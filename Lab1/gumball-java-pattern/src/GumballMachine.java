

public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	int price,coin = 0;
	private int value = 0;
 
	public GumballMachine(int numberGumballs,int price,int coin) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
 		this.price = price;
 		this.coin = coin;
	}
 
	public void insertQuarter(int coin) {
		if((this.coin == coin) || this.coin == 0)
		state.insertQuarter(coin);
		else 
			state.ejectQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public void setValue(int coin)
    {
    	this.value += coin;
    }
    
    public int getValue()
    {
    	return this.value;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("The price of gumball in this machine is " + price + "\n");
		if(coin==0)
		{
			result.append("This Machine accepts any coins.\n");
		}
		else
		{
			result.append("This machine accepts only " + coin +" coins.");
		}
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}

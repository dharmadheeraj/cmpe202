

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,50,0);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter(20);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(50);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}

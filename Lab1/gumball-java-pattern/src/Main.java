

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,50,0);
		GumballMachine gumballMachine2 = new GumballMachine(2,25,25);
		GumballMachine gumballMachine3 = new GumballMachine(5,50,25);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter(20);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(50);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter(25);
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter(20);
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter(50);
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		
		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter(25);
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter(25);
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter(50);
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);
	}
}

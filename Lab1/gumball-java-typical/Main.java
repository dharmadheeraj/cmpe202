public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,50,25);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 ,gumballMachine );
		gumballMachine.turnCrank(gumballMachine);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 ,gumballMachine );
		gumballMachine.turnCrank(gumballMachine);
		gumballMachine.insertQuarter( 50 ,gumballMachine );
		gumballMachine.turnCrank(gumballMachine);

		System.out.println(gumballMachine);
	}
}

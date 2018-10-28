/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */


/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;    
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;
    private IDecorator carddec,expdec;
    

    public App() {

        screen = new Screen();
        carddec = new CardNumberDecorator();
        expdec = new ExpiryDecorator();
        num = new CreditCardNum(carddec);
        exp = new CreditCardExp(expdec);
        cvc = new CreditCardCVC();
        
        

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if(ch.equals("X"))
    	{
    		count--;
    		screen.key(ch, count);
    	}
    	else
    	{
        count++;
        screen.key(ch, count);
    	}
    }

}


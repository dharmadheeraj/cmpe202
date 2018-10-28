
public class CardNumberDecorator implements IDecorator {

	
	public String display(String output) {
		
		String result = "";
		for(int i=0;i<output.length();i++)
		{
			result += output.charAt(i);
			if((i+1)%4 == 0 && i != 15)
			{
				result += " ";
			}
		}
		
		return result;
	}

}

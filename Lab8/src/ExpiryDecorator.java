
public class ExpiryDecorator implements IDecorator{

	public String display(String output) {
		
		String result = "";
		if(output.length()>2)
		{
			result = output.substring(0,2) + "/" + output.substring(2,output.length());
		}
		else
		{
			result = output;
			
		}
		
		return result;
	}

}

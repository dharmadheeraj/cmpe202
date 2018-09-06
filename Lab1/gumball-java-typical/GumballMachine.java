public class GumballMachine
{

    private int num_gumballs;
    private boolean has_coin;
	private int value;
	private int accepted;
	private boolean valid_coin;
	private int sum;

    public GumballMachine( int size , int value)
    {
        // initialise instance variables
        this.num_gumballs = size;
		this.value = value;
        this.has_coin = false;
        this.sum = 0;
    }

	public GumballMachine( int size , int value, int accepted)
    {
        // initialise instance variables
        this.num_gumballs = size;
		this.value = value;
		this.accepted = accepted;
		this.valid_coin = false;
        this.has_coin = false;
        this.sum = 0;
    }
	
	
    public void insertQuarter(int coin,GumballMachine GM)
    {
        if(GM.accepted > 0 )
        {
        	if(GM.accepted == coin)
        	{
	        	GM.has_coin = true;
	        	GM.valid_coin = true;
	        	GM.sum = GM.sum + coin;
        	}
        	else
        	{
        		GM.has_coin = true;
        		GM.valid_coin = false;
        		GM.sum = GM.sum + coin;
        	}
        }
        else
        {
        	GM.has_coin = true;
    		GM.valid_coin = true;
    		GM.sum = GM.sum + coin;
        }
    }
    
    public void turnCrank(GumballMachine GM)
    {
    	if ( GM.has_coin && GM.value <= GM.sum && GM.valid_coin)
    	{
    		if ( GM.num_gumballs > 0 )
    		{
    			GM.num_gumballs-- ;
    			GM.has_coin = false ;
    			System.out.println( "Thanks for your amount.  Gumball Ejected!" ) ;
    			GM.sum = GM.sum - GM.value;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your amount." ) ;
    		}
    	}
    	else 
    	{
    		if(!GM.valid_coin)
    		System.out.println( "Please insert a Valid Coin" ) ;
    		if(!GM.has_coin)
    		System.out.println( "Please insert a Coin" ) ;
    		if(GM.value > GM.sum)
    		System.out.println( "Please insert a Sufficient Funds" ) ;
    	}        
    }
}

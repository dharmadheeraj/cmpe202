	public class PremiumCheese extends LeafDecorator
{
    private String[] options ;
    
    
    public PremiumCheese( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0 )
        {
        	//1.50 for selecting extra cheese and 1.50 per selection
            this.price += 1.50; 
            this.price +=  (options.length) * 1.50 ;
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}
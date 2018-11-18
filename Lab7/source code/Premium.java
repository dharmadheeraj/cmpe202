public class Premium extends LeafDecorator
{
    private String[] options ;
    
    
    public Premium( String d )
    {
        super(d) ;
    }
    
 // 2$ extra for marinated Tomatoes
    public void setOptions( String[] options ) 
    {
        this.options = options ;
        		for(int i=0;i<options.length;i++)
        		{
        			this.price += 1.00;
        			if ( "Marinated Tomatoes".equals(options[i]) )
        				this.price += 2.00 ;
        				
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
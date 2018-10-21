public class Toppings extends LeafDecorator
{
    private String[] options ;
    
    
    public Toppings( String d )
    {
        super(d) ;
    }
    
   
    public void setOptions( String[] options )
    {
        this.options = options ;
        //no price change for regular toppings 
        //if ( options.length > 4 )
          //  this.price += (options.length-4) * 0.75 ;
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
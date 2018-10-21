  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Orgainc Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jallepino Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //Unlimited
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( c ) ;
        //Premium Cheese
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese"} ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( t ) ;
        // Sauce extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Appricot Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // premium toping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( s ) ;
        //Bun Choice
        Bun bun = new Bun( "Bun Options" ) ;
        String[] buno = { "Ciabatta(Vegan)" } ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( p ) ;
        //Side Options
        Side side = new Side("Side Options" ) ;
        String[] sideo = { "ShoeString Fries" } ;
        side.setOptions( sideo ) ;
        side.wrapDecorator( bun ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/
public class Toppings {

    int cost;
    int order;
    String name;

    Toppings(String name,int cost,int order)
    {
    this.cost = cost;
     this.order = order;
     switch(order)
     {
         case 1 :
             this.name = name;
            break;
         case 2 :
             this.name = "-->" + name;
             break;
         case 3 :
             this.name = name;
             break;
         case 4 :
             this.name = "{{{" + name + "}}}";
             break;
             default:
                 this.name = name;
     }
    }

    public String getName()
    {
        return this.name;
    }

    public int getCost()
    {
        return this.cost;
    }

    public int order()
    {
        return this.order;
    }
}

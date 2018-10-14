import java.util.ArrayList;

public class Burger implements Order{

    int cost;
    String name;
    Strategy s;
    ArrayList<Toppings> toppings;

    Burger(String name)
    {
        this.name = name;
        this.toppings = new ArrayList<Toppings>();
        s = new Bill();
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void addToppings(Toppings topping)
    {
        this.toppings.add(topping);
        this.cost = this.cost + topping.cost;
    }

    @Override
    public ArrayList<Toppings> getToppings() {
        return this.toppings;
    }


    public String display(){
        return s.Display(this);
    }

    public void setStrategy(Strategy strategy)
    {
        this.s = strategy;
    }






}

import java.util.ArrayList;

public class MilkShake implements Order{

    int cost = 10;
    String name;
    Strategy s;

    MilkShake()
    {
        s= new Bill();
        name = "MilkShake";
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addToppings(Toppings toppings) {
        //NO TOPPINGS TO MILKSHAKE
    }

    @Override
    public ArrayList<Toppings> getToppings() {
        return null;
    }

    @Override
    public String display() {
        return s.Display(this);
    }

    public void setStrategy(Strategy strategy)
    {
        this.s = strategy ;
    }

}

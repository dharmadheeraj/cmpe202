import java.util.ArrayList;

public interface Order {

    int getCost();
    String getName();
    void addToppings(Toppings toppings);
    ArrayList<Toppings> getToppings();
    String display();
    void setStrategy(Strategy strategy);


}

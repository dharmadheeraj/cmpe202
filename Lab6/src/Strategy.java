import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public interface Strategy {

    String Display(Order o);
}

class Bill implements Strategy {

    @Override
    public String Display(Order o) {

        String result = o.getName() + "              " + o.getCost() + '\n';
        if(o.getToppings() != null) {
            for (Toppings topping : o.getToppings()) {
                result = result + "     " + topping.getName() + '\n';
            }
        }

        return result;
    }
}


class PackingSlip implements Strategy {

    @Override
    public String Display(Order o) {

        String result = o.getName() + '\n';
        if(o.getToppings() != null) {
            ArrayList<Toppings> sortedToppings= o.getToppings();
            sortedToppings.sort(Comparator.comparing(Toppings::order));
            for (Toppings topping : sortedToppings) {
                result = result + "     " + topping.getName() + '\n';
            }
        }

        return result;
    }
}
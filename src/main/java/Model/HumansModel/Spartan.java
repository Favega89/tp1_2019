package Model.HumansModel;

import static java.util.concurrent.ThreadLocalRandom.*;

public class Spartan extends Human {

    public Spartan(String name, Integer age, Integer weight, Idrink idrink, Ipee ipee) {
        super(name, age, weight, idrink, ipee);
        bladderCapacity = 50;
    }

    public void drink(){
        bladderCapacity = idrink.drink(bladderCapacity);
        super.drink();
    }

}

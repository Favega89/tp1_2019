package Model.HumansModel;

import static java.util.concurrent.ThreadLocalRandom.current;

public class Viking extends Human {


    public Viking(String name, Integer age, Integer weight, Idrink idrink, Ipee ipee) {
        super(name, age, weight, idrink, ipee);
        bladderCapacity = 70;
    }

    public void drink(){
        bladderCapacity = idrink.drink(bladderCapacity);
        super.drink();
    }

}

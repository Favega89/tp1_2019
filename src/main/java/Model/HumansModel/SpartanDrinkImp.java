package Model.HumansModel;

import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * Created by Yo on 17/4/2019.
 */
public class SpartanDrinkImp implements Idrink {
    @Override
    public int drink(int bladderCapacity) {
        bladderCapacity -= current().nextInt(1,10) + 3;
        return bladderCapacity;
    }
}

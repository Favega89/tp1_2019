package Model.HumansModel;

/**
 * Created by Yo on 17/4/2019.
 */
public class PeeImplemented implements Ipee {
    @Override
    public boolean goToPee(int bladderCapacity) {
        return bladderCapacity <= 0 ? true : false;
    }
}

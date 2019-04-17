package Model.HumansModel;

import static Logger.Logger.*;

public class Human implements Comparable<Human> {

    private Ipee ipee;
    protected Idrink idrink;

    protected String name;
    private Integer age;
    private Integer weight;
    protected Integer bladderCapacity;

    public Human(String name, Integer age, Integer weight, Idrink idrink, Ipee ipee) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.idrink = idrink;
        this.ipee = ipee;
    }

    public boolean goToPee() {
        return ipee.goToPee(this.bladderCapacity);
    }

    public void drink() {
        drinkLog(getClass().getSimpleName(),name,bladderCapacity);
    }

    @Override
    public int compareTo(Human human) {
        return this.weight.compareTo(human.getWeight());
    }

    public void present(){
        presentLog(getClass().getSimpleName(),name);
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

}

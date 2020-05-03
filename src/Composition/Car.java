package Composition;

public class Car extends Vechile {

    private int doors;
    private int enginecapacity;

    public Car(String name, int doors, int enginecapacity) {
        super(name);
        this.doors = doors;
        this.enginecapacity = enginecapacity;
    }
}

package academy.learnprogramming;

public class Car extends Vehicle {
    private int wheels, doors, gears, currentGear;
    private boolean isManual;

    public Car(int wheels, int doors, int gears, boolean isManual, String name, String size) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
    }
}

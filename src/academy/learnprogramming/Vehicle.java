package academy.learnprogramming;

public class Vehicle {
    private String name, size;
    private int currentVelocity, currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int velocity) {
        currentVelocity = velocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int direction) {
        currentDirection = direction;
    }

    public void stop() {
        currentVelocity = 0;
    }
}
package academy.learnprogramming;

import academy.learnprogramming.Car;

public class Outlander extends Car {
    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super(5, 5, 6, false, "Outlander", "4WD");
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            setCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            setCurrentGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            setCurrentGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            setCurrentGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}

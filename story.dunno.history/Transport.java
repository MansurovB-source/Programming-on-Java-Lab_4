/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
abstract class Transport {
    private final double fuelConsumption;
    private double speed;

    public Transport(double fuelConsumption, double speed) {
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    double getSpeed() {
        return this.speed;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    double getFuelConsumption() {
        return this.fuelConsumption;
    }


}

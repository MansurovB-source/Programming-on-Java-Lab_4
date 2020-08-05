/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Rocket extends Transport implements Movement{
    public Rocket(double fuelConsumption, double speed) {
        super(fuelConsumption, speed);
    }

    @Override
    public boolean move(Planet from, Planet to) {
        return true;
    }
}

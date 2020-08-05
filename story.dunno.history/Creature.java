/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public interface Creature {
    String getName();
    default Planet getPlanet() {
        return null;
    };
    default void setPlanet(Planet planet) {};
    void setName(String name);

}

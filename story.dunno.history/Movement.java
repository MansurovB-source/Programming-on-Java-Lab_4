/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public interface Movement {
      default boolean move(Planet from, Planet to) {
          return true;
      }

      default boolean move() {
          return true;
      }
}

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Dunno extends HumanConstruct implements Creature {

    private Planet planet;

    public Dunno(String name, String lastname, Planet planet) {
        super(name, lastname);
        this.planet = planet;
    }

    public Dunno(String name, String lastname) {
        super(name, lastname);
    }

    public Dunno() {
        super();
    }


    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Planet getPlanet() {
        return this.planet;
    }

    @Override
    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public void setRandomPlanet() {
        Random random = new Random();

        if(random.nextInt(3) == 0) {
            this.planet = Planet.SPACE;
        } else if (random.nextInt(3) == 1) {
            this.planet = Planet.SPACE;
        } else this.planet = Planet.EARTH;
    }

    void getQuestions(HumanConstruct humanConstruct, int question_number) {

        System.out.printf(" Answer from %s %s: \n", this.getName(), this.getName());
        if(humanConstruct instanceof Journalist) {
            switch (question_number) {
                case 0:
                    System.out.println("Ел специальную еду для космонавтов из тюбика зубной пасты");
                    break;
                case 1:
                    System.out.println("Сны были как на земле, то есть обычные.\n " +
                            "Например:");
                    dream.makeDream();
                    break;
                case 2:
                    System.out.println("Жители Давилона были очень гостеприимны");
                    break;
            }
        } else {
            switch (question_number) {
                case 0:
                    System.out.println("Я увидел много звезд");
                    break;
                case 1:
                    System.out.println("На поверхности Земли можно было наблюдать над горами и облаками");
                    break;
                case 2:
                    System.out.println("Большая Луна похожа на Землю там мног зелени, у них энергетический прорыв");
                    break;
            }
        }
    }

    void talkAboutRocket() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dunno dunno = (Dunno) o;
        return this.getName().equals(dunno.getName()) && this.getName().equals(dunno.getName()) && this.planet == dunno.planet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLastName(), planet);
    }

    @Override
    public String toString() {
        return "Dunno{" +
                "name=" + this.getName() + " " +
                "lastname=" + this.getLastName() + " " +
                "planet=" + planet +
                '}';
    }

//        planet = this.planet;
        Dream dream = new Dream() {
            @Override
            public void makeDream() {
                if(planet == Planet.EARTH) {
                    Random random = new Random();
                    showDream(random.nextInt(3));
                }
            }

            private void showDream(long number) {
                switch((int)number) {
                    case 0:
                        System.out.println("Я видел сон о котиков");
                        break;
                    case 1:
                        System.out.println("Мне приснился сам Илон Маск");
                        break;
                    case 2:
                        System.out.println("Про свой компуктер");
                        break;
                }
            }
        };

    public static class Coordinate {
        private double x;
        private double y;
        private double z;

        public Coordinate(double x, double y, double z) {
            if(x < 0 || y < 0 || z < 0) {
                throw new CoordinateException("\n" +
                        "Object coordinates cannot be negative");
            }
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getZ() {
            return z;
        }

    }

    public void soar(Coordinate coordinate) {
        class Soar implements SoaringFlight {
            @Override
            public void soar(Dunno.Coordinate coordinate) {
                if((int)coordinate.getX() == 0 && (int)coordinate.getY() == 0 && (int)coordinate.getZ() == 0) {
                    System.out.println("Я на открытом космосе, ураа!!!");
                }
            }
        }
        Soar soar = new Soar();
        soar.soar(coordinate);
    }
}

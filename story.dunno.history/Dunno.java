import java.util.Objects;

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

    void getQuestions(HumanConstruct humanConstruct, int question_number) {

        System.out.printf(" Answer from %s %s: \n", this.getName(), this.getName());
        if(humanConstruct instanceof Journalist) {
            switch (question_number) {
                case 0:
                    System.out.println("Ел специальную еду для космонавтов из тюбика зубной пасты");
                    break;
                case 1:
                    System.out.println("Сны были как на земле, то есть обычные");
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
}

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Journalist extends HumanConstruct {
    public Journalist(String name, String lastname) {
        super(name, lastname);
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
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public int askQuestion() {
        System.out.printf(" Question from journalist community %s %s: \n", this.getName(), this.getName());
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                System.out.println("Что вы ели и пили на ракете?");
                return 0;
            case 1:
                System.out.println("Какие сны вы видели?");
                return 1;
            case 2:
                System.out.println("Понравились ли вам жители Давилона?");
                return 2;
        }
        return 0;
    }
}

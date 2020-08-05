/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
abstract class HumanConstruct implements Creature, Human {
    private String name;
    private String lastname;

    public HumanConstruct(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public HumanConstruct() {

    }

    static void fikl() {
        System.out.println("I love you");
    }

    @Override
    public String getLastName() {
        return lastname;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

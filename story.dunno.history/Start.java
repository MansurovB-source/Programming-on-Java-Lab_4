

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Start {
    public static void main(String[] args) {

        Dunno dunno = new Dunno("Behruz", "Mansurov");
        dunno.setRandomPlanet();

        Journalist journalist1 = new Journalist("Jhon", "Jonas");
        Journalist journalist2 = new Journalist("Jhon", "Jonas");
        Journalist journalist3 = new Journalist("Jhon", "Jonas");

        Scholarly scholarly1 = new Scholarly("Albert", "Einstein");
        Scholarly scholarly2 = new Scholarly("Stephen", "Hawking");
        Scholarly scholarly3 = new Scholarly("Niels", "Bohr");

        Rocket rocket = new Rocket(25000, 10);

        long speed = (long) rocket.getSpeed();
        long fuel = (long) rocket.getFuelConsumption();
        if(dunno.getPlanet() == Planet.EARTH) {
            try {
                Thread.sleep(fuel/speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dunno.talkAboutRocket();

            dunno.getQuestions(journalist1, journalist1.askQuestion());
            dunno.getQuestions(journalist2, journalist2.askQuestion());
            dunno.getQuestions(journalist3, journalist3.askQuestion());

            dunno.getQuestions(scholarly1, scholarly1.askQuestion());
            dunno.getQuestions(scholarly2, scholarly2.askQuestion());
            dunno.getQuestions(scholarly3, scholarly3.askQuestion());



        } else if(dunno.getPlanet() == Planet.SPACE) {
            Dunno.Coordinate coordinate = new Dunno.Coordinate(00, 0, 0);
            dunno.soar(coordinate);
        } else
            System.out.println("Nothing, I'll add something after");

    }
}

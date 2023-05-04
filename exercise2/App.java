import Explorers.*;
import Planets.*;

public class App {
    public static void main(String[] args) {

        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet mars = new Mars();
        Planet mercury = new Mercury();
        Planet neptune = new Neptune();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet venus = new Venus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer droid = new AndroidExplorer();

        mercury.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        mars.accept(astronaut);
        jupiter.accept(astronaut);
        saturn.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);


        mercury.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        mars.accept(rover);
        jupiter.accept(rover);
        saturn.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);

        mercury.accept(droid);
        venus.accept(droid);
        earth.accept(droid);
        mars.accept(droid);
        jupiter.accept(droid);
        saturn.accept(droid);
        uranus.accept(droid);
        neptune.accept(droid);

    }
}

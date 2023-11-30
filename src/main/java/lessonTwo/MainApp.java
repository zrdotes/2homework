package lessonTwo;

public class MainApp {

    public static void main(String[] args) {
        Actions[] participants = {
                new Human("Джон", 180, 1),
                new Robot("Гротт", 200, 3),
                new Cat("Мурка", 200, 1)};

        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        for (Actions participant : participants) {
            treadmill.overcome(participant);
            wall.overcome(participant);
        }
    }

}

package lessonTwo;

public class Cat implements Actions {

    protected String name;
    protected int maxRunDistance;
    protected int maxJumpDistance;

    public Cat(String name, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpDistance) {
            System.out.println(name + " успешно прыгнул на высоту " + height + " метров");
        } else {
            System.out.println(name + " не смог прыгнуть на высоту " + height + " метров");
        }
    }
}

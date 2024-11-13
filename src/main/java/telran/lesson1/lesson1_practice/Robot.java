package telran.lesson1.lesson1_practice;

public class Robot extends Creature{

    private String description;
    private int version;
    private static int totalRobotCount;
    private static final int ROBOT_DEFAULT_VERSION = 1;

    public Robot(String name, String description) {
        super(name);
        this.version = ROBOT_DEFAULT_VERSION;
        totalRobotCount++;
        this.description = description;
    }

    public void printCurrentRobotInfo() {
        System.out.println("This is a Robot: " + getName() + "\n description: "+ description + "\n version: " + version);
    }

    public static void printTotalRobotCount() {
        System.out.println("Total count: " + totalRobotCount);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}


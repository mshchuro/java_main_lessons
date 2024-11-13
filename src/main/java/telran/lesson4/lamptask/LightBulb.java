package telran.lesson4.lamptask;

public class LightBulb {

    private boolean isOn;

    public void on(boolean on) {
        isOn = on;
    }

    public void checkState() {
        System.out.println("Light Lamp is" + (isOn ? " on" : " off"));
    }
}

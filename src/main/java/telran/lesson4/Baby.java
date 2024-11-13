package telran.lesson4;

public class Baby extends Child{

    public Baby(String name) {
        super(name);
    }

    @Override
    public void sayGreetings() {
        System.out.println("Hello from Baby!");
    }
}

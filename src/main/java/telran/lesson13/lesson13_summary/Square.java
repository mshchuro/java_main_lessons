package telran.lesson13.lesson13_summary;

public class Square extends Rectangle{

    public Square(double length) {
        super(length, length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + this.getLength() +
                ", height=" + this.getLength() +
                ", area=" + super.findArea() +
                '}';
    }
}

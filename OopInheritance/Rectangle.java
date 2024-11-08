package OopInheritance;

public class Rectangle {
    private double width;

    public double getWidth() {
        return width;
    }

    private double length;

    public double getLength() {
        return length;
    }

    public Rectangle(double width, double length) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
        if (length < 0)
            this.length = 0;
        else
            this.length = length;
    }

    public double getArea() {
        return width * length;
    }

}

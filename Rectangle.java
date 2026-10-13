public class Rectangle implements Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getClassName() {
        return "Rectangle";
    }

    @Override 
    public String toString() {
        return "Rectangle (" + width + "x" + height + ")";
    }
}
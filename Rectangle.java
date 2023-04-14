public class Rectangle extends Shape {
    public Rectangle(int id, String type) {
        super(id, type);
    }

    public Rectangle(int x, int y, int width, int height) {
        super();
    }

    @Override
    public String getSVGString() {
        return null;
    }

    @Override
    public boolean isWithin(double x1, double y1, double x2, double y2) {
        return false;
    }

    @Override
    public void translate(double dx, double dy) {

    }

}


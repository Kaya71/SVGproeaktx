public class Line extends Shape {
    private double x1, y1, x2, y2;

    public Line(int id, double x1, double y1, double x2, double y2) {
        super(id, "line");
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    @Override
    public String getSVGString() {
        return String.format("<line id=\"%d\" x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" />", getId(), x1, y1, x2, y2);
    }

    @Override
    public boolean isWithin(double x1, double y1, double x2, double y2) {
        return (this.x1 >= x1 && this.x1 <= x2 && this.y1 >= y1 && this.y1 <= y2)
                && (this.x2 >= x1 && this.x2 <= x2 && this.y2 >= y1 && this.y2 <= y2);
    }

    @Override
    public void translate(double dx, double dy) {
        x1 += dx;
        y1 += dy;
        x2 += dx;
        y2 += dy;
    }
}

public class Circle extends Shape {
    private double cx, cy, r;

    public Circle(int id, double cx, double cy, double r) {
        super(id, "circle");
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public Circle(int cx, int cy, int r) {
        super();
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getR() {
        return r;
    }

    @Override
    public String getSVGString() {
        return String.format("<circle id=\"%d\" cx=\"%f\" cy=\"%f\" r=\"%f\" />", getId(), cx, cy, r);
    }

    @Override
    public boolean isWithin(double x1, double y1, double x2, double y2) {
        double distanceFromCenter = Math.sqrt(Math.pow(cx - ((x1 + x2) / 2), 2) + Math.pow(cy - ((y1 + y2) / 2), 2));
        return (distanceFromCenter + r) <= (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) / 2);
    }

    @Override
    public void translate(double dx, double dy) {
        cx += dx;
        cy += dy;
    }
}

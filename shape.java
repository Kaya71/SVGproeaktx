abstract class Shape {
    private int id;
    private String type;

    public Shape(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public Shape() {

    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public abstract String getSVGString();

    public abstract boolean isWithin(double x1, double y1, double x2, double y2);

    public abstract void translate(double dx, double dy);
}

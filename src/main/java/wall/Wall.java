package wall;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    public Wall(double width, double height) {
        this.width = Math.max(0, width);
        this.height = Math.max(0, height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = Math.max(0, width);
    }

    public void setHeight(double height) {
        this.height = Math.max(0, height);
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                '}';
    }
}


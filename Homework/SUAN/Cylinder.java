package SUAN;

public class Cylinder  implements C{
    private int radius;
    private int height;
    private String color;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void volume() {

    }
}

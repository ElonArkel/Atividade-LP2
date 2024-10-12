public class Rectangle {
    public float length;
    public float width;

    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
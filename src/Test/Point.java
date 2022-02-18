package Test;


public class Point {
    int x;
    int y;
    int x1;
    int y1;
    int z1;


    public Point(int x1, int y1, int z1) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
    }


    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getZ1() {
        return z1;
    }

    public void setZ1(int z1) {
        this.z1 = z1;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y=y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

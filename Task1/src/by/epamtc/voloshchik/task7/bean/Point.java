package by.epamtc.voloshchik.task7.bean;

public class Point {

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(getClass() != obj.getClass())return false;
        Point p = (Point)obj;
        return x == p.getX() && y == p.getY();
    }

    public String toString()
    {
        return "Point with coordinates" +
                " x = " + x +" y = " + y;
    }
}

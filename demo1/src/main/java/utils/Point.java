package main.java.utils;

import java.io.Serializable;

public class Point implements Serializable {
    private static final long serialVersionUID = 4350420193796601374L;
    private final double x;
    private final double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public double getX(){return this.x;}
    public double getY(){return this.y;}
    
    public Point myclone() {
        return new Point(this.x, this.y);
    }

    public double distanceBetweenPoints(Point a) {
         return Math.sqrt(Math.pow(a.x - this.x, 2) + Math.pow(a.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", this.x) + ", " + String.format("%.2f", this.y) + ")";
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if ( o == null || this.getClass() != o.getClass()) return false;
        Point p = (Point)o;
        return this.x == p.x && this.y == p.y;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
package main.java.view.viewmodel;

import main.java.utils.Point;

public class SpecificCar {
    private final Point point;
    private final String numberPlate;

    public SpecificCar(Point point, String numberPlate) {
        this.point = point;
        this.numberPlate = numberPlate;
    }

    public Point getPoint() {
        return point;
    }

    public String getNumberPlate() {
        return numberPlate;
    }
}
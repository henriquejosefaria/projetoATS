package main.java.view.viewmodel;

import main.java.exceptions.InvalidNewRegisterException;
import main.java.model.CarModel;
import main.java.utils.Point;

public class RegisterCar {
    private final String numberPlate;
    private final CarModel.CarType type;
    private double avgSpeed;
    private final double basePrice;
    private final double gasMileage;
    private final int range;
    private final Point pos;
    private final String brand;

    public RegisterCar(String numberPlate, String type, double basePrice, double gasMileage, int range, Point pos, String brand) throws InvalidNewRegisterException {
        this.numberPlate = numberPlate;
        try {
            this.type = CarModel.CarType.valueOf(type.toUpperCase());
        }
        catch (IllegalArgumentException e){
            throw new InvalidNewRegisterException();
        }
        this.basePrice = basePrice;
        this.gasMileage = gasMileage;
        this.range = range;
        this.pos = pos;
        this.brand = brand;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }
    public String getNumberPlate() {
        return numberPlate;
    }

    public CarModel.CarType getType() {
        return type;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getGasMileage() {
        return gasMileage;
    }

    public int getRange() {
        return range;
    }

    public Point getPos() {
        return pos;
    }

    public String getBrand() {
        return brand;
    }
}

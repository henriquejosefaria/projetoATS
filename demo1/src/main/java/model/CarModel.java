package main.java.model;

import main.java.exceptions.UnknownCarTypeException;

import java.io.Serializable;

public class CarModel implements Serializable {
    private final String brand;
    private final CarType type;
    private final double avgSpeed;

    public CarModel(CarType type, double avgSpeed, String brand) {
        this.avgSpeed = avgSpeed;
        this.brand = brand;
        this.type = type;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public CarType getType() {
        return this.type;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        CarModel m = (CarModel) o;
        return this.avgSpeed == m.avgSpeed
                && this.brand.equals(m.brand)
                && this.type == m.type;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public enum CarType {
        ELECTRIC,
        GAS,
        HYBRID,
        ANY;

        public boolean isEqual(CarType a) {
            return a == this || a == ANY;
        }

        public static CarType fromString(String s) throws UnknownCarTypeException {
            switch (s) {
                case "Electrico":
                    return CarType.ELECTRIC;
                case "Gasolina":
                    return CarType.GAS;
                case "Hibrido":
                    return CarType.HYBRID;
                case "Todos":
                    return CarType.ANY;
                default:
                    throw new UnknownCarTypeException();
            }
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("BRAND:").append(this.brand).append("\n");
        s.append("TYPE:").append(this.type).append("\n");
        s.append("AVGSPEED:").append(this.avgSpeed).append("\n");
        return s.toString();
    }
}

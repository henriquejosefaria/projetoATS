package main.java.view.viewmodel;
import main.java.exceptions.InvalidNewRentalException;
import main.java.model.Car;
import main.java.utils.Point;
import model.CarModel;

public class AutonomyCar {
    private final Point point;
    private final int autonomy;
    private final CarModel.CarType type;

    public AutonomyCar(Point point, int autonomy, String type) throws InvalidNewRentalException {
        try {
            this.type = CarModel.CarType.valueOf(type.toLowerCase());
        }
        catch (IllegalArgumentException e){
            throw new InvalidNewRentalException();
        }
        this.point = point;
        this.autonomy = autonomy;
    }

    public Point getPoint() {
        return point;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public CarModel.CarType getType() { return type; }
}

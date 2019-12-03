package main.java.view.viewmodel;

import main.java.exceptions.InvalidNewRentalException;
import main.java.model.CarModel;
import main.java.utils.Point;

public class RentCarSimple {
    private final Point point;
    private final CarModel.CarType type;

    public RentCarSimple(Point point, String type) throws InvalidNewRentalException {

        this.point = point;
        try {
            this.type = CarModel.CarType.valueOf(type.toLowerCase());
        }
        catch (IllegalArgumentException e){
            throw new InvalidNewRentalException();
        }
    }

    public Point getPoint() {
        return this.point;
    }

    public CarModel.CarType getCarType() {
        return this.type;
    }
}

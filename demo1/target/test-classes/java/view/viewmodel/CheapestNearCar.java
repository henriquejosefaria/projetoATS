package main.java.view.viewmodel;


import main.java.exceptions.InvalidNewRentalException;
import main.java.model.CarModel;
import main.java.utils.Point;

public class CheapestNearCar {
        private final Point point;
        private final int walkDistance;
        private final CarModel.CarType type;

        public CheapestNearCar(Point point, int walkDistance, String type) throws InvalidNewRentalException {
            try {
                this.type = CarModel.CarType.valueOf(type.toLowerCase());
            }
            catch (IllegalArgumentException e){
                throw new InvalidNewRentalException();
            }
            this.point = point;
            this.walkDistance = walkDistance;
        }

        public Point getPoint() {
            return point;
        }

        public int getWalkDistance() {
            return walkDistance;
        }

        public CarModel.CarType getType() { return type; }
    }

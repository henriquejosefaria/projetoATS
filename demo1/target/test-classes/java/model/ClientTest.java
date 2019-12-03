package main.java.model;

import main.java.utils.Point;
import org.junit.jupiter.api.Test;
import main.java.model.Client;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Point p = new Point(1.0,1.0);
    Client u1 = new Client(p,"u1@gmail.com","passU1","u1 nome","morada do u1", 999111111);
    Owner o = new Owner("emailDono@gmail.com","Dono1","moradaDono1",912123123,"dono123");
    Point dest = new Point(2.0,2.0);

    @Test
    void getPos() {
         Point p1 = u1.getPos();
        boolean boolean0 = p1.equals(p);
        assertTrue(boolean0);
    }

    @Test
    void addPendingRental() throws Exception{
        CarModel cm = new CarModel(CarModel.CarType.fromString("Electrico"),80.4,"InventadaxD");
        Car c = new Car("AA-11-11",o,cm,3,3,30,p);
        Rental r = new Rental(c,u1,dest);
        u1.addPendingRental(r);
        boolean boolean1 = r.equals(u1.getPendingRates().get(0));;
        assertTrue(boolean1);
    }

    @Test
    void rate() throws Exception{
        CarModel cm = new CarModel(CarModel.CarType.fromString("Electrico"),80.4,"InventadaxD");
        Car c = new Car("AA-11-11",o,cm,3,3,30,p);
        Rental r = new Rental(c,u1,dest);
        u1.rate(r,1,1);
        boolean boolean2 = u1.getPendingRates().isEmpty();
        assertTrue(boolean2);
    }

    @Test
    void setPos() {
        Point x = new Point(10.0,10.0);
        u1.setPos(x);
        Point x1 = u1.getPos();
        boolean boolean3 = x.equals(x1);
        assertTrue(boolean3);
    }

    @Test
    void getPendingRates() throws Exception{
        CarModel cm = new CarModel(CarModel.CarType.fromString("Electrico"),80.4,"InventadaxD");
        Car c = new Car("AA-11-11",o,cm,3,3,30,p);
        Rental r = new Rental(c,u1,dest);
        u1.addPendingRental(r);
        boolean boolean4 = false;
        if((u1.getPendingRates().size() == 1) && r.equals(u1.getPendingRates().get(0))) boolean4 = true;
        assertTrue(boolean4);
    }

    @Test
    void testEquals() {
        boolean boolean5 = u1.equals(u1);
        assertTrue(boolean5);
    }

    @Test
    void myclone() {
        boolean boolean6 = u1.wrongEquals(u1.myclone());
        assertTrue(boolean6);
    }
}



























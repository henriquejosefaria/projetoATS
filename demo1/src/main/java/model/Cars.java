package main.java.model;

import main.java.utils.Point;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

import main.java.exceptions.CarExistsException;
import main.java.exceptions.InvalidCarException;
import main.java.exceptions.NoCarAvaliableException;
import main.java.exceptions.UnknownCompareTypeException;

public class Cars implements Serializable {
    private static final long serialVersionUID = 2716582249374370739L;
    private final Map<String, Car> carBase;

    Cars() {
        this.carBase = new HashMap<>();
    }

    private Cars(Cars c) {
        this.carBase = c.carBase
                .values()
                .stream()
                .collect(Collectors
                        .toMap(Car::getNumberPlate, Car::myclone));
    }

    /**
     * \brief Adiciona um carro à base de dados
     * @param a Carro a adicionar
     */
    void addCar(Car a) throws CarExistsException {
        Boolean bol = false;
        if(this.carBase.containsKey(a.getNumberPlate())) System.out.println("Carro repetido");
        if(this.carBase
                .putIfAbsent(a.getNumberPlate(), a)
                != null)
            throw new CarExistsException();
    }

    /**
     * \brief Procura um carro na base de dados
     * @param numberPlate Matricula do carro a procurar
     * @return Clone do carro, Null se não existir
     */
    Car searchCar(String numberPlate) throws InvalidCarException {
        Car car = this.carBase.get(numberPlate);
        if(car == null)
            throw new InvalidCarException();
        return car;
    }

    /**
     * Clona um objeto da classe Model.Cars
     * @return Clone do objeto
     */
    public Cars myclone() {
        return new Cars(this);
    }

    /**
     * Obtem a lista de todos os carros no sistema
     * de um determinado tipo
     * @param b Tipo a procurar
     * @return Lista dos carros
     */
    public List<Car> listOfCarType(CarModel.CarType b) {
        return this.carBase
                .values()
                .stream()
                .filter(e-> e.getType().isEqual(b))
                .map(Car::myclone)
                .collect(Collectors
                        .toCollection(ArrayList::new));
    }

    Car getCar(String compare, Point dest, Point origin, CarModel.CarType a) throws UnknownCompareTypeException, NoCarAvaliableException {
        try {
            if (compare.equals("MaisPerto")) {
                return this.carBase
                        .values()
                        .stream()
                        .filter(e -> e.getType().isEqual(a)
                                && e.hasRange(dest)
                                && e.isAvailable())
                        .sorted(Comparator.comparingDouble(e ->
                                e.getPosition()
                                        .distanceBetweenPoints(origin)))
                        .collect(Collectors.toList())
                        .get(0);
            }

            if (compare.equals("MaisBarato")) {
                return this.carBase
                        .values()
                        .stream()
                        .filter(e -> e.getType().isEqual(a)
                                && e.hasRange(dest)
                                && e.getPosition().distanceBetweenPoints(dest) != 0
                                && e.isAvailable())
                        .sorted(Comparator.comparingDouble(e -> e.getBasePrice() * e.getPosition()
                                .distanceBetweenPoints(dest)))
                        .collect(Collectors.toList())
                        .get(0);
            }
        }
        catch (IndexOutOfBoundsException ignored) {
            throw new NoCarAvaliableException();
        }
        throw new UnknownCompareTypeException();
    }

    Car getCar(Point dest, Point origin, double range, CarModel.CarType a) throws NoCarAvaliableException {
        try {
            return this.carBase
                    .values()
                    .stream()
                    .filter(e -> e.getType().isEqual(a)
                            && e.hasRange(dest)
                            && origin.distanceBetweenPoints(e.getPosition()) <= range
                            && e.isAvailable())
                    .sorted(Comparator.comparingDouble(e -> e.getBasePrice() * origin.distanceBetweenPoints(dest)))
                    .collect(Collectors.toList())
                    .get(0);
        }
        catch(IndexOutOfBoundsException ignored) {
            throw new NoCarAvaliableException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Cars cars = (Cars) o;
        return this.carBase.equals(cars.carBase);
    }
    @Override
    public int hashCode() {
    	  return super.hashCode();
    }

    Car getCar(Point dest, double range, CarModel.CarType a) throws NoCarAvaliableException {
        try {
            return this.carBase
                    .values()
                    .stream()
                    .filter(e -> e.getType().isEqual(a)
                            && e.hasRange(dest)
                            && e.getRange() >= range
                            && e.isAvailable())
                    .sorted(Comparator.comparingDouble(e -> e.getBasePrice() * e.getPosition()
                            .distanceBetweenPoints(dest)))
                    .collect(Collectors.toList())
                    .get(0);
        }
        catch (IndexOutOfBoundsException ignored) {
            throw new NoCarAvaliableException();
        }
    }
}

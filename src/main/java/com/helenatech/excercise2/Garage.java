package com.helenatech.excercise2;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private int carCapacity;
    private Car[] carsInside;
    private int numberOfCarsInside;

    public Garage(int carCapacity) {
        this.carsInside = new Car[carCapacity];
        this.carCapacity = carCapacity;
        this.numberOfCarsInside = 0;
    }

    public void replaceCar(Car car, int i){
        this.carsInside[i] = car;
    }

    public void addCar(Car car){
        if (numberOfCarsInside + 1 < carCapacity){
            this.carsInside[numberOfCarsInside] = car;
            numberOfCarsInside += 1;
        }
    }

    public void removeCar(int i){
        carsInside[i] = null;
        numberOfCarsInside -= 1;
    }

    public int getNumberOfCarsInside() {
        return numberOfCarsInside;
    }

    public void setNumberOfCarsInside(int numberOfCarsInside) {
        this.numberOfCarsInside = numberOfCarsInside;
    }

    public Car[] getCarsInside() {
        return carsInside;
    }

    public void setCarsInside(Car[] carsInside) {
        this.carsInside = carsInside;
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carCapacity=" + carCapacity +
                ", carsInside=" + Arrays.toString(carsInside) +
                ", numberOfCarsInside=" + numberOfCarsInside +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Garage)) return false;
        Garage garage = (Garage) o;
        return carCapacity == garage.carCapacity && numberOfCarsInside == garage.numberOfCarsInside && Arrays.equals(carsInside, garage.carsInside);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(carCapacity, numberOfCarsInside);
        result = 31 * result + Arrays.hashCode(carsInside);
        return result;
    }
}

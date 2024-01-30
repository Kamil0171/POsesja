package moto;

import java.util.Arrays;

class Vehicle<T extends Comparable<T>> implements Comparable<Vehicle<T>> {
    private String model;
    private T speed;

    public Vehicle(String model, T speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public T getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Vehicle<T> other) {
        return this.speed.compareTo(other.speed);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}

class Moto {
    public static <T extends Comparable<T>> T maxValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Vehicle<Integer> car1 = new Vehicle<>("Car1", 200);
        Vehicle<Integer> car2 = new Vehicle<>("Car2", 180);
        Vehicle<Integer> car3 = new Vehicle<>("Car3", 220);

        Vehicle<Integer>[] vehicles = new Vehicle[]{car1, car2, car3};

        Vehicle<Integer> fastestCar = maxValue(vehicles);
        System.out.println("The fastest car is: " + fastestCar);
    }
}

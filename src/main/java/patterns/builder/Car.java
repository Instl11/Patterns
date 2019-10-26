package patterns.builder;

public class Car {
    private String name;
    private int seats;
    private boolean rightWheel;
    private String color;
    private int fuel;
    private int price;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {

        private Car newCar;

        private CarBuilder() {
            newCar = new Car();
        }

        public CarBuilder setName(String name) {
            newCar.name = name;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            newCar.seats = seats;
            return this;
        }

        public CarBuilder setRightWheel(boolean rightWheel) {
            newCar.rightWheel = rightWheel;
            return this;
        }

        public CarBuilder setColor(String color) {
            newCar.color = color;
            return this;
        }

        public CarBuilder setFuel(int fuel) {
            newCar.fuel = fuel;
            return this;
        }

        public CarBuilder setPrice(int price) {
            newCar.price = price;
            return this;
        }

        public Car build() {
            return newCar;
        }
    }
}

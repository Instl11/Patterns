package patterns.builder;

public class CarRunner {
    public static void main(String[] args) {

        Car ford = Car.builder()
                .setName("Ford")
                .setColor("Red")
                .setFuel(60)
                .setPrice(500000)
                .setRightWheel(false)
                .setSeats(4)
                .build();
        System.out.println(ford);
    }
}

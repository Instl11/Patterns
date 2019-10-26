package patterns.builder;

import lombok.Builder;

@Builder
public class Car2 {

    private String name;
    private int seats;
    private boolean rightWheel;
    private String color;
    private int fuel;
    private int price;
}

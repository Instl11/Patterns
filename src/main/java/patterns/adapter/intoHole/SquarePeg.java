package patterns.adapter.intoHole;

import lombok.Data;
import lombok.NonNull;

@Data
public class SquarePeg {
    @NonNull
    private double width;

    public double getSquare(){
        return width*width;
    }
}

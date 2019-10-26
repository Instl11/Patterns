package patterns.adapter.intoHole;

import lombok.Data;
import lombok.NonNull;

@Data
public class AdapterSquareToRound extends RoundPeg {
    @NonNull
    private SquarePeg squarePeg;

    public double getRadius(){
        return Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
    }
}

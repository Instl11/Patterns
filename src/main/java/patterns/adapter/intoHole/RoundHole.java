package patterns.adapter.intoHole;

import lombok.Data;
import lombok.NonNull;

@Data
public class RoundHole implements Cloneable {
    @NonNull
    private Double radius;

    public boolean isFits(RoundPeg peg){
        boolean result;
        result = this.radius >= peg.getRadius();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

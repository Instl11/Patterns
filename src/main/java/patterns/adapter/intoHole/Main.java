package patterns.adapter.intoHole;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RoundHole hole = new RoundHole(5.0);
        SquarePeg squarePeg = new SquarePeg(50);

        AdapterSquareToRound adapter = new AdapterSquareToRound(squarePeg);

        boolean fits = hole.isFits(adapter);
        System.out.println(fits);

        RoundHole clone = (RoundHole) hole.clone();
        System.out.println(clone);
    }
}

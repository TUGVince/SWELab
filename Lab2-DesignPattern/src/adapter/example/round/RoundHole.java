package adapter.example.round;

/**
 * EN: RoundHoles are compatible with RoundPegs.
 *
 * RU: КруглоеОтвер�?тие �?овме�?тимо �? КруглымиКолышками.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}

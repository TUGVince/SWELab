package adapter.example.round;

/**
 * EN: RoundPegs are compatible with RoundHoles.
 *
 * RU: КруглыеКолышки �?овме�?тимы �? КруглымиОтвер�?ти�?ми.
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

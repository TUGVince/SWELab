package adapter.example.square;

/**
 * EN: SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 *
 * RU: КвадратныеКолышки не�?овме�?тимы �? КруглымиОтвер�?ти�?ми (они о�?тали�?ь в
 * проекте по�?ле бывших разработчиков). �?о мы должны как-то интегрировать их в
 * нашу �?и�?тему.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}

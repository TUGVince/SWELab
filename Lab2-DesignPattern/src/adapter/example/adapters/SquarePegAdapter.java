package adapter.example.adapters;

import adapter.example.round.RoundPeg;
import adapter.example.square.SquarePeg;

/**
 * EN: Adapter allows fitting square pegs into round holes.
 *
 * RU: �?даптер позвол�?ет и�?пользовать КвадратныеКолышки и КруглыеОтвер�?ти�?
 * вме�?те.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // EN: Calculate a minimum circle radius, which can fit this peg.
        //
        // RU: Ра�?�?читываем минимальный радиу�?, в который пролезет �?тот колышек.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}

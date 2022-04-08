package adapter.example;

import adapter.example.adapters.SquarePegAdapter;
import adapter.example.round.RoundHole;
import adapter.example.round.RoundPeg;
import adapter.example.square.SquarePeg;

/**
 * EN: Somewhere in client code...
 *
 * RU: Где-то в клиент�?ком коде...
 */
public class Demo {
    public static void main(String[] args) {
        // EN: Round fits round, no surprise.
        //
        // RU: Круглое к круглому — в�?ё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // EN: hole.fits(smallSqPeg); // Won't compile.
        //
        // RU: hole.fits(smallSqPeg); // �?е �?компилирует�?�?.

        // EN: Adapter solves the problem.
        //
        // RU: �?даптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}

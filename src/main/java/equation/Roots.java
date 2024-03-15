package equation;

import java.util.ArrayList;
import java.util.List;

public class Roots {

    public static List<Double> getFloatPolynomRoots(Polynom polynom) {
        List<Double> roots = new ArrayList<>();
        double discriminant = polynom.getDiscriminant();
        if (discriminant > 0) {
            roots.add((-polynom.getB() - Math.sqrt(discriminant)) / (2 * polynom.getA()));
            roots.add((-polynom.getB() + Math.sqrt(discriminant)) / (2 * polynom.getA()));
        } else if (discriminant == 0) {
            roots.add(-polynom.getB() / (2 * polynom.getA()));
        }
        return roots;
    }

    public static List<Complex> getComplexPolynomRoots(Polynom polynom) {
        List<Complex> roots = new ArrayList<>();
        double discriminant = polynom.getDiscriminant();
        if (discriminant > 0) {
            roots.add(Complex.ofReal((-polynom.getB() - Math.sqrt(discriminant)) / (2 * polynom.getA())));
            roots.add(Complex.ofReal((-polynom.getB() + Math.sqrt(discriminant)) / (2 * polynom.getA())));
        } else if (discriminant == 0) {
            roots.add(Complex.ofReal(-polynom.getB() / (2 * polynom.getA())));
        } else {
            roots.add(new Complex(-polynom.getB() / (2* polynom.getA()), -Math.sqrt(-discriminant) / 2* polynom.getA()));
            roots.add(new Complex(-polynom.getB() / (2* polynom.getA()), Math.sqrt(-discriminant) / 2* polynom.getA()));
        }
        return roots;
    }

}

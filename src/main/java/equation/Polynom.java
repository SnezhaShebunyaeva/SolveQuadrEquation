package equation;

public class Polynom {

    private double a;
    private double b;
    private double c;

    /**
     * Конструктор полинома
     * @param a - коэффициент при x^2
     * @param b - коэффициент при x
     * @param c - свободный коэффициент
     */
    public Polynom(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Коэффициент a должен быть отличен от нуля");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Вычисление дискриминанта
     * @return значение дискриминанта
     */
    public double getDiscriminant() {
        return b*b - 4*a*c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
package equation;

public class Complex {

    private double realPart;
    private double imaginaryPart;

    /**
     * Конструктор комлексного число
     * @param realPart - действительная часть
     * @param imaginaryPart - мнимая часть
     */
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public static Complex ofReal(double realPart) {
        return new Complex(realPart, 0);
    }

    /**
     * Перевод комплексного значения в строку
     * @return комплексное число в виде строки
     */
    @Override
    public String toString() {

        if (imaginaryPart < 0) {
            return realPart + " - " + String.valueOf(imaginaryPart).replace("-", "") + "i";
        }

        return realPart + " + " + imaginaryPart + "i";
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
}
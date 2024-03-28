import equation.Polynom;
import equation.Roots;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Решение квадратного уравнения в вещественной и комплексной системах счисления
 * Шебуняева Снежана, 14гр, 1к маг
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите a:");
            double a = in.nextDouble();

            System.out.println("Введите b:");
            double b = in.nextDouble();

            System.out.println("Введите c:");
            double c = in.nextDouble();

            Polynom polynom = new Polynom(a, b, c);

            System.out.println("Выберите систему счисления:\n 1 - Вещественная\n 2 - Комплексная");
            int sys = in.nextInt();

            while (sys != 1 && sys != 2) {
                System.out.println("Введите допустимое число (1 или 2)");
                sys = in.nextInt();
            }

            switch (sys) {
                case 1 -> {
                    final var roots = Roots.getFloatPolynomRoots(polynom);
                    System.out.println(roots);
                }
                case 2 -> {
                    final var roots = Roots.getComplexPolynomRoots(polynom);
                    System.out.println(
                            roots.stream()
                                    .map(Object::toString)
                                    .collect(Collectors.joining(", "))
                    );
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Должно быть введено число");
        }
    }

}
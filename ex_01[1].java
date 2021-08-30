package POO;

import java.util.Scanner;

// Fórmula de Heron
public class ex_01
{

    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        double p;
        double A;

        System.out.println("Digite o lado a: ");
        a = sc1.nextDouble();
        System.out.println("Digite o lado b: ");
        b = sc1.nextDouble();
        System.out.println("Digite o lado c: ");
        c = sc1.nextDouble();

        p = Perimetro(a, b, c);
        A = Area(a, b, c, p);

        System.out.println("Perímetro: " + p);
        System.out.println("Área: " + A);

        System.exit(0);
    }

    public static double Perimetro(double a, double b, double c)
    {
        double p;

        p = (a + b + c) / 2;
        return p;
    }

    public static double Area(double a, double b, double c, double p)
    {
        double A;

        A = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return A;
    }
}

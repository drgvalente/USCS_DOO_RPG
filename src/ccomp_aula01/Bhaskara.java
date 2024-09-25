package ccomp_aula01;

public class Bhaskara {
    private static double a, b, c;
    private static double delta;
    private static double x1, x2;
    
    private static double calcularDelta()
    {
        delta = b*b - 4*a*c;
        return delta;
    }
    
    private static int numeroRaizes()
    {
        if (calcularDelta() < 0)
        {
            return 0;
        }
        else if (calcularDelta() == 0)
        {
            return 1;
        }
        else 
        {
            return 2;
        }
    }
    
    public static void CalcularBhaskara(double a1, double b1, double c1)
    {
        a = a1;
        b = b1;
        c = c1;
        if (numeroRaizes() == 0)
        {
            System.out.println("Não há raízes reais");
        }
        else if (numeroRaizes() == 1)
        {
            x1 = -b / 2*a;
            System.out.println("Raíz em: " + x1);
        }
        else
        {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Raízes em: " + x1 + " e " + x2);
        }
        
    }
    
    
}

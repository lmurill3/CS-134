import java.util.Scanner;

public class QuadraticFormula
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner ( System.in );
        
        System.out.println( "Quadratic Formula" );
        System.out.println( "ax^2 +bx + c" );
        
        double a;
        double b;
        double c;
        
        System.out.print( "Submit a: " );
        a = scanner.nextDouble();
        
        System.out.print( "Submit b: " );
        b = scanner.nextDouble();
        
        System.out.print( "Submit c: " );
        c = scanner.nextDouble();
        
        
        double x1;
        double x2;
        
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        
        System.out.println( "x1 is " + x1 );
        System.out.println( "x2 is " + x2 );
        
        scanner.close();
    }
   
}

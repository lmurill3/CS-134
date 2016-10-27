import java.util.Scanner;

public class AreaofCircle
{  public static void main(String args[])
    {  
        Scanner scanner = new Scanner( System.in );
        
        System.out.println( "Area of Circle Calulater");
        
        double pi, r, area;
        pi = 3.14;
        System.out.print( " Please enter radius " );
        r = scanner.nextDouble();
        
        area = pi * Math.pow( r, 2 );
        
        System.out.println( "Area is " + area);
        
        scanner.close();
        
    }
}

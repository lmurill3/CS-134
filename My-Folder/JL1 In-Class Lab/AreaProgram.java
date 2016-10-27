import java.util.Scanner;
public class AreaProgram
{  
    public static void main(String[] arges)
    {  
        Scanner scanner = new Scanner( System.in );
        
        System.out.println( "Area and Perimeter Calulater");
        
        double width, length, area, perimeter;
        
        System.out.print( "What is the width? " );
        width = scanner.nextDouble();
        
        System.out.print( "What is the length? " );
        length = scanner.nextDouble();
        
        area = width * length;
        perimeter = 2 * length + 2 * width;
        
        System.out.println( "Area: " + area );
        System.out.println( "Perimeter: " + perimeter );
        
        
        scanner.close();
    }
}

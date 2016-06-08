/**
 This program is for calculating the focus, the area, and the circumference of an ellipse. 
 @author Simmy Payyappilly Varghese
 */
import java.util.Scanner;
 
public class Ellipse86448 {

    public static void main(String[] args) {
        double a,b,focus,area,circumference;
        //final double PI= 3.14159;              //PI value is declared as constant
        Scanner input =new Scanner(System.in);
        System.out.println ("Enter the value of Semi Major Radius of the ellipse,a:") ;
        a=input.nextDouble(); 
        System.out.println("Enter the value of Semi Minor Radius of the ellipse,b :");
        b=input.nextDouble();
        focus= Math.sqrt(Math.pow(a,2)-Math.pow(b,2));  //Calculates the focus of the ellipse 
        System.out.printf("Focus of the ellipse: %.2f" ,focus ) ; 
        System.out.print("\n");
        area=Math.PI*a*b;           //Calculates the area of the ellipse 
        System.out.printf("Area of the ellipse: %.2f" ,area ) ;
        circumference= Math.PI*(3*(a+b)-(Math.sqrt(10*a*b+3*(Math.pow(a,2)+Math.pow(b,2))))); //Calculates the circumference of the ellipse 
        System.out.print("\n");
        System.out.printf("Circumference of the ellipse: %.2f" ,circumference ) ;
         System.out.print("\n");
     }
    }

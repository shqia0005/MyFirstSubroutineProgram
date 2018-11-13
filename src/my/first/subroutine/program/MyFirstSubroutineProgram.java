/*
 * Jessica Qiao
 * 12/11/2018
 */

package my.first.subroutine.program;
import java.util.Scanner;

/**
 *
 * @author shqia0005
 */
public class MyFirstSubroutineProgram {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        double num1,num2,num3;
        
        System.out.println("Enter a base: ");
        num1 = keyedInput.nextDouble();
        System.out.println("Enter a height: ");
        num2 = keyedInput.nextDouble();
        System.out.println("The area of this triangle is: " + AreaOfTrig (num1,num2));
        
        
        System.out.println("Enter a radius: ");
        num1 = keyedInput.nextDouble();
        System.out.println("The circumference of the circle: " + CircumferenceCfCircle(num1));
        
        System.out.println("Enter three numbers: ");
        num1 = keyedInput.nextDouble();
        num2 = keyedInput.nextDouble();
        num3 = keyedInput.nextDouble();
        System.out.println("The average of these three numbers is :" + AverOfNumbers (num1,num2,num3));
        
        System.out.println("Enter two values of angles: ");
        num1 = keyedInput.nextDouble();
        num2 = keyedInput.nextDouble();
        System.out.println("The missing angle of this triangle is: " + FindMissingAngle (num1,num2) + "°");
        
        System.out.println("Enter an area of a circle: ");
        num1 = keyedInput.nextDouble();
        System.out.println("The radius of this circle is : " + RadiusOfCircle(num1));
        
        AreaOfTrig (num1,num2);
        CircumferenceCfCircle(num1);
        AverOfNumbers (num1,num2,num3);
        FindMissingAngle (num1,num2);
        RadiusOfCircle(num1);
        
    }
    
    public static double AreaOfTrig (double num1,double num2)
    {
        double area = (num1*num2)/2;
        return(area);
        
    }
    public static double CircumferenceCfCircle (double num1)
    {
        double Circumference = num1 * num1;
        return(Circumference);
    }
    public static double AverOfNumbers (double num1, double num2, double num3)
    {
        double average = (num1 + num2 + num3) / 3;
        return(average);
    }
    public static double FindMissingAngle (double num1, double num2)
    {
        double missingangle = 360 - num1 - num2;
        return(missingangle);
    }
    public static double RadiusOfCircle (double num1)
    {
        double radius = Math.sqrt(num1);
        return(radius);
    }
   

}

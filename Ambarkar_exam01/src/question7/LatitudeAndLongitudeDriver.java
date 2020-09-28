/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class LatitudeAndLongitudeDriver {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter point1 (latitude and longitude) in degrees: ");
        double x1=scan.nextDouble();
        double y1=scan.nextDouble();
        System.out.println("Enter point2 (latitude and longitude) in degrees: ");
        double x2=scan.nextDouble();
        double y2=scan.nextDouble();
        LatitudeAndLongitude lal=new LatitudeAndLongitude();
        double dist=lal.distance(x1, x2, y1, y2);
        System.out.println("The distance between the two points is "+dist+" km");
        scan.close();
    }
    
}

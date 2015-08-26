/**
 * Author: Brandon B.
 * Date: 8-26-15
 */

import java.util.Scanner;

public class sphereCalculation {
    
    public static void main(String[] args) {
    	final double pi = 3.14;
    	double radius, diameter, circumference, surface_area, volume;

    	Scanner kbReader = new Scanner(System.in);

		System.out.print("Enter the radius of the sphere: ");
		radius = kbReader.nextDouble();

		diameter = radius * 2;
		circumference = 2 * pi * radius;
		surface_area = 4 * pi * Math.pow(radius, 2);
		volume = (4 * pi * Math.pow(radius, 3)) / 3.0;

		System.out.println("\nRadius: " + radius);
		System.out.println("Diameter: " + diameter);
		System.out.println("Circumference: " + circumference);
		System.out.println("Surface Area: " + surface_area);
		System.out.println("Volume: " + volume);
		// Read radius
    	// Calculate the diameter
    	// Calculate cirCUMference (-;
    	// Calculate surface area
    	// Calculate volume
    	// Print diameter
    	// Print circumference
    	// Print surface area
    	// Print volume
    }
}

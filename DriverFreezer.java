/*
 * Christine Pavlik
 * Thursday 22, 2020
 * CIS 2212 Midterm Project
 * Start time: 4:07
 */
package midtermProject;

import java.util.Scanner;

public class DriverFreezer {
public static void main (String [] arg) {
		
		Scanner input = new Scanner(System.in);
		//creating freezer1 and inputing data and puting the data in setters
		Freezer freezer1 = new Freezer();
		
		System.out.println("Enter name: ");
		String name = input.nextLine();
		freezer1.setBrandName(name);
		
		System.out.println("Enter color: ");
		String color = input.nextLine();
		freezer1.setColor(color);
		
		System.out.println("Enter height: ");
		double height = input.nextDouble();
		freezer1.setHeight(height);
		
		System.out.println("Enter width: ");
		double width = input.nextDouble();
		freezer1.setWidth(width);
		
		System.out.println("Enter depth: ");
		double depth = input.nextDouble();
		freezer1.setDepth(depth);
		
		System.out.println("Enter price: ");
		double originalPrice = input.nextDouble();
		while (originalPrice < 129.99) {
			System.out.println("Price must be $129.99 or greater. Please try again: ");
				originalPrice = input.nextDouble();
		}
		freezer1.setOriginalPrice(originalPrice);
		
		//giving data to freezer in Freezer.java
		Freezer freezer2 = new Freezer("King Kold", 29.3, 24.75, 22.25, 199.99, "White");
		//freezer3's output in the instructions for the price is wrong (it outputs 159.75 not 159.59 as the instructions say earlier)
		Freezer freezer3 = new Freezer("Frigidaire", 24.5, 18.19, 16.78, 159.59, "White");
		//outputs the string
		System.out.println(freezer1.toString());
		System.out.println(freezer2.toString());
		System.out.println(freezer3.toString());
	
	}

}

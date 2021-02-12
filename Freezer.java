/*
 * Christine Pavlik
 * Thursday 22, 2020
 * CIS 2212 Midterm Project
 * Start time: 4:07
 */
package midtermProject;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Freezer {
	Scanner input = new Scanner(System.in);
	//data fields
	private String brandName;
	private double height;
	private double width;
	private double depth;
	private double originalPrice;
	private String color;
	
	
	//////////////////////////////////////////////
	//two population constructors
	public Freezer(String newBrandName, double newHeight, double newWidth, double newDepth, double newOriginalPrice, String newColor) {
		this.brandName = newBrandName;
		this.height = newHeight;
		this.width = newWidth;
		this.depth = newDepth;
		this.originalPrice = newOriginalPrice;
		this.color = newColor;
		
	}
	
	public Freezer() {
	}
	////////////////////////////////////////////////
	//getters and setters
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getDepth() {
		return depth;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public double getOriginalPrice() {
		
		return originalPrice;
	}
	public void setColor(String color) {
		this.color = color;
		
	}
	public String getColor() {
		return color;
	}
	////////////////////////////////////////
	//formulas
	public double cubicFeet () {	
		return ((width * height * depth) / 1728);
	}
	public double totalPrice() {
		
		if (color.equalsIgnoreCase("white")  && originalPrice >= 199.99)
		{
			return (originalPrice - (originalPrice * .1));
		}
		else {
			return originalPrice;
		}
	}

	/////////////////////////////////////////////
	//toString turns data into a string
	//OPRIONAL OVERIDE ANOTATION is below I do not think we learned about this but I learned about it
	// from this (https://docs.oracle.com/javase/tutorial/java/annotations/predefined.html) article
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat ("#,##0.000");
		DecimalFormat df2 = new DecimalFormat ("#,##0.00");
		
		return (brandName + "\n  Color: " + color + "\n  Cubic Feet: " + df.format(cubicFeet()) + "\n  Original Price: $"
		+ df2.format(originalPrice) + "\n  Final Price: $" + df2.format(totalPrice()) + "\n");
	}
}




public class Circle {
	private double radius;
	//variable radius
	//getter
	public double getRadius(){
		return radius;
	}//end of getter return radius
	//setter
	public void setRadius(double radius) {
		this.radius=radius;
	}//end of setter
	//default constructor
	public Circle() {
		radius = 0;
	}//end of default constructor where radius is set to 0
	//preferred constructor s is the parameter
	public Circle(double r) 
	{
		radius = r;
	}//end of preferred constructor where radius is set to the parameter r
	//method
	public double area() {
		double area_circle = Math.PI*Math.pow(radius, 2);
		return area_circle;
	}//end of the method for area of a circle, the equation for the area of a circle and returned the area of a circle
	}//end of class

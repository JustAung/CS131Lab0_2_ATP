/**
 * 
 */

/**
 * @author aung
 *Square 
 *Spring 2023
 */
public class Square 
{
double side;
//variable side
//getter
public double getSide(){
	return side;
}
//setter
public void setSide(double side) {
	this.side=side;
}
//default constructor
public Square() {
	side = 0;
}
//preferred constructor s is the parameter
public Square(double s) {
	side = s;
}
//method
public double area() {
	double area_square = Math.pow(side, 2);
	return area_square;
}

}

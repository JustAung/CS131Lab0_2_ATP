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
int side;
//variable side
//getter
public double getSide(){
	return side;
}
//setter
public void setSide(int side) {
	this.side=side;
}
//default constructor
public Square() {
	side = 0;
}
//preferred constructor s is the parameter
public Square(int s) {
	side = s;
}
//method
public int area() {
	return side*side;
}

}

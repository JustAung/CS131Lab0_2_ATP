/**
 * 
 */

/**
 * @author aung
 *Application 
 *Spring 2023
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate and Call the method from the classes
		/*Square[] sArray=new Square[];
		for(int i=0;i<7;i++)
		{
			sArray=aSquare;
		}*/
		Square sqr = new Square(3);
		System.out.println("Square area: "+sqr.area());
		
		Circle cir = new Circle(4);
		System.out.println("Circle area: "+cir.area());

		
		ArrayFun arf = new ArrayFun();
		System.out.println("Forward: ");
		arf.forward();
		System.out.println("Backward: ");
		arf.backward();
		System.out.println("Sum: ");
		arf.sum();
	}

}

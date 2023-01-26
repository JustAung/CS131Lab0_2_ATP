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
		
		ArrayFun arf = new ArrayFun();
		System.out.println("Forward: ");
		arf.forward();
		System.out.println("Backward: ");
		arf.backward();
		System.out.println("Sum: ");
		arf.sum();
		
	}

}

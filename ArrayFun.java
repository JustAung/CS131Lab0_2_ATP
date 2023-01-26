/**
 * 
 */

/**
 * @author aung
 *ArrayFun 
 *Spring 2023
 */
public class ArrayFun 
{
	//Array variable "myArray"
Square[] myArray;

//Array variable "myArray" 	  6 objects 
//default array
public ArrayFun() {
	myArray = new Square[6];
	for(int i=0;i<6;i++)
	{
		myArray[i] = new Square(i);
	}
}

//setter
public void setArrayItem(int index, Square s) 
{
	myArray[index] = s;
}
//getter
public Square getArrayItem( int index) 
{
	return myArray[index];
}
public void forward() {
	for(int i=0;i<6;i++) {
		System.out.println(myArray[i].area());
	}
}//end of forward constructor
public void backward() {
	for(int i=6-1;i>=0;i--) 
	{
		System.out.println(myArray[i].area());
	}
}//end of backward constructor
public void sum() {
	int accum = 0;
	for(int i=0;i<6;i++) 
	{
	myArray[i].area();
	accum = accum + myArray[i].area();
	System.out.println(accum);

	}
}//end of sum constructor

}//end class

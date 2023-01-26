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
//basic array
public ArrayFun() {
	Square[] myArray = new Square[6];
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
//Preferred constructor 
int size = myArray.length;
public ArrayFun(int size) 
{
	Square Square0 = new Square();
	myArray[0] = Square0;
	
	Square Square1 = new Square();
	myArray[1] = Square1;
	
	Square Square2 = new Square();
	myArray[2] = Square2;
	
	Square Square3 = new Square();
	myArray[3] = Square3;
	
	Square Square4 = new Square();
	myArray[4] = Square4;
	
	Square Square5 = new Square();
	myArray[5] = Square5;

}//end of ArrayFun preferred constructor

public void forward() {
	for(int i=0;i<6;i++) {
		myArray[i].side=i;
	System.out.println(i);
	}
}
public void backward() {
	
}
public void sum() {
	for (int i = 0; i >= 1; --i) {
	      int sum = i;     
	      System.out.println(i);
	    }

}

}//end class

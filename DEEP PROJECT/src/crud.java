import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class crud {
public static void main(String[] args)  throws Exception{
	String name = null;
	// Create method(Instruction Method) -------------------
	try {
		System.out.println("Enter your name ");
		Scanner sc = new Scanner(System.in);
		 name = sc.next();
		System.out.print("*Object Sucessfully Created with  ");
		System.out.println("Object Id --> "+ name.hashCode() );
	
	}catch (Exception e) {
		System.out.println("Please Enter String Variable ");
		}
	//----------------------------------------------
	
	
	//  Switch case :- Viewing method(file Reader) ------------------------------
	
	List<String> list = new ArrayList<String>();
	list.add(name);
	System.out.println("*Viewing object*");
	System.out.print(list+" "+"---->" ); 
	System.out.println("Object id Used here is "+name.hashCode());
	//----------------------------------
	
	// Switch Case-  Delete Method(Garbage Collection Method ) ----------------------
	list.remove(name);
	System.out.println("*Deleteing object*");
	System.out.println("Object Sucessfully removed  ----> ID "+ name.hashCode());
	System.out.print(list);
	System.out.println("-->Empty List ");// Empty List
	//--------------------

   }
}
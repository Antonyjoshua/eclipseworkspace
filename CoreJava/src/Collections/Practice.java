package Collections;

public class Practice {

	//private Practice() {
	// If you make a constructor private in a superclass, it cannot be directly
	// invoked from outside the class, including from subclasses. Therefore, you
	// cannot create objects of the superclass or its subclasses using the private
	// constructor from outside the class hierarchy.
	//check constructor class in core jave
	public Practice() {
		System.out.println("Can we able to create object?");
	}

	public static void main(String[] args) {
		Practice pr = new Practice();

	}

}

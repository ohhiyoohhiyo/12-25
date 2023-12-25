package MyClass;

import java.util.ArrayList;

public class MyList {
	public static void test() {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Tom");
		myList.add("Allen");
		myList.add("Ben");
		
		myList.remove(1);
		myList.remove("Allen");
		
		for(String v : myList)
			System.out.println(v);
	}
}

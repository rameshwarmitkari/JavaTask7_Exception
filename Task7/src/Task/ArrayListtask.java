package Task;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListtask {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Guvi");
		al.add("Zen");
		al.add("Class");
		al.add("Abc");
		System.out.println(al.size());
		System.out.println(al);

		al.clear();
		// al.removeAll(al);
		System.out.println(al);
		System.out.println(al.size());
		

	}

}

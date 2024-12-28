package Task;

import java.util.LinkedList;
import java.util.List;

public class ListToArray {

	 public static void main(String[] args)
	    {

	        List<String> list = new LinkedList<String>();
	        list.add("Guvi");
	        list.add("zen");
	        list.add("class ");
	        list.add("Pra");

	        // Storing it inside array of strings
	        String[] arr = new String[list.size()];

	        // Converting ArrayList to Array
	        // using get() method
	        for (int i = 0; i < list.size(); i++)
	            arr[i] = list.get(i);

	        // Printing elements of array on console
	        for (String x : arr)
	            System.out.print(x + " ");
	    }
}

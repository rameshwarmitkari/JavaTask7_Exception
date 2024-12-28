package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreemapOfEmp {

	private static final int Entry = 0;

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap();

		tmap.put(1, "Jerry");
		tmap.put(2, "Alex");
		tmap.put(3, "Tom");
		tmap.put(4, "Ram");
		tmap.put(5, "Hales");
		tmap.put(6, "Bruce");

		// System.out.println(tmap);

		ArrayList<String> valueList = new ArrayList(tmap.values());

		System.out.println("before sort- " + valueList);

		Collections.sort(valueList);

		System.out.println("after sort- " + valueList);
	}

}

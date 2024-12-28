package Task;

public class ArrayAndStringIndex {

	public static void main(String[] args) {

		try {
			int arr[] = { 10, 20, 40, 30 };

			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("handled array Index Out Of Bounds Exceptionn");
			e.printStackTrace();
		}

		try {
			String str = "Guvi Zen";
			System.out.println(str.charAt(10));
		} catch (StringIndexOutOfBoundsException s) {

			System.out.println("String Index Out Of Bounds Exceptionn");
			s.printStackTrace();
		}

	}

}

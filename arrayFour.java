//arrayFour.java
public class arrayFour {
	public static void main (String[] args){
		String bob[] = new String[10];
		bob[0] = "James";
		bob[1] = "Stuart";
		bob[2] = "Tom";
		bob[3] = "Joanne";
		bob[4] = "Lenny";

		int size = bob.length;
		for(int n = 0; n<size; n++)
			System.out.println(bob[n]);
	}
}
// arraySix.java
public class arraySix {
	public static void main (String[] args){
		boolean check = false;

		String[] bob = {"James","Joanne","Tom","Lenny","Owen"};
		int size = bob.length;

		for (int n=0; n<size; n++){
			if(bob[n]=="Tommy")
				check = true;
		}
		if (check == true) {
		System.out.println("yes");
	}else{
		System.out.println("no");
	}

	}
}
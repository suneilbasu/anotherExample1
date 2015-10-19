public class LinearSearch{
	int theArray[] = new int[]{0,1,1,3,5,8,13,21};	
	int oddball = 3;

	public static int  checkItOut(int[] n){
		if(n[0]==3){
			System.out.println("no");
			return 0;
		}else{
			System.out.println("yess");
			return 1;
		}
	}

}
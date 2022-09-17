public class OddsAndEvens {
	
	
	
	public static void odd(int[] haha) {
		
		
		System.out.print("\nOdds - [");
		for(int x=0; x<haha.length; x++) {
			if((haha[x]%2)==1) {
				System.out.print(haha[x]+" ");
			}
		}
		System.out.print("]");
	}
	
	
	
	
	public static void even(int[] haha) {
		System.out.print("\nEvens - [");
		for(int x=0; x<haha.length; x++) {
			if((haha[x]%2)==0) {
				System.out.print(haha[x]+" ");
			}
		}
		System.out.print("]");
	}
	
	
	
	
	
public static void main(String Args[]) {
	
	
int[] haha = {2, 4, 6, 3, 10, 12, 14, 22, 23, 1, 3};	

System.out.println();
odd(haha);
even(haha);
}
}

/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int num = (int)(Math.random() * 10);
		int smallernum = 0;
		while(num >= smallernum){
			System.out.print(num + " ");
			smallernum = num;
			num = (int)(Math.random() * 10);
		}
		System.out.println();
	}
}

/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int block = Integer.parseInt(args[0]);
		int row = 1;
		for (int i = 0; i < block; i++) {
			if(row % 2 != 0){
				for (int j = 0; j < block; j++) {
					System.out.print("* ");
				}
			}
			if(row % 2 == 0){
				for (int k = 0; k < block; k++) {
					System.out.print(" *");
				}
			}
			row++;
			System.out.println();	
		}
	}
}

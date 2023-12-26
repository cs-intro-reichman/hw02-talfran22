/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		double family = Double.parseDouble(args[0]);
		boolean girl = false;
		boolean boy = false;
		double count = 0;
		double sumchildrens = 0;
		double average = 0;
		int famwith2 = 0;
		int famwith3 = 0;
		int famwith4 = 0;
		double randnum = 0.0;
		for (double i = 0; i < family ; i++) {	
			while(girl == false || boy == false){
				randnum = Math.random();
			if(randnum > 0.5){
				girl = true;
			}
			if(randnum < 0.5){
				boy = true;
			}
			count++;
			}
			if(count == 2){
				famwith2++;
			}
			if(count == 3){
				famwith3++;
			}
			if(count >= 4){
				famwith4++;
			}
			sumchildrens += count;
			count = 0;
			girl = false;
			boy = false;
		}
		average = sumchildrens / family;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + (int)(famwith2));
		System.out.println("Number of families with 3 children: " + (int)(famwith3));
		System.out.println("Number of families with 4 or more children: " + (int)(famwith4));
		if(famwith2 >= famwith3 && famwith2 >= famwith4){
			System.out.println("the most common number of children is 2.");
		}
		else{
			if(famwith3 >= famwith4){
				System.out.println("the most common number of children is 3.");
			}
			else{
				System.out.println("the most common number of children is 4 or more.");
			}
		}

	}
}

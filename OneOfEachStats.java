import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		double family = (double)(T);
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
				randnum = generator.nextDouble();
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
			System.out.println("The most common number of children is 2.");
		}
		else{
			if(famwith3 >= famwith4){
				System.out.println("The most common number of children is 3.");
			}
			else{
				System.out.println("The most common number of children is 4 or more.");
			}
		}
    
	}
}

/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int numperfect = Integer.parseInt(args[0]);
		int count = 1;
		String perfect = numperfect + " is a perfect number since " + numperfect + " = 1";
		for (int i = 2; i < numperfect ; i++) {
			if(numperfect % i == 0){
				count += i;
				perfect += " + " + i;
			}
		}
		if(numperfect % count == 0){
			System.out.println(perfect);
		}
		else{
			System.out.println(numperfect + " is not a perfect number");
		}
	}
}

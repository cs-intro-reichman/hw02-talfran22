
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean girl = false;
		boolean boy = false;
		int count = 0;
		double randnum = 0.0;
		while(girl == false || boy == false){
			randnum = Math.random();
			if(randnum > 0.5){
				System.out.print("g ");
				girl = true;
			}
			if(randnum < 0.5){
				System.out.print("b ");
				boy = true;
			}
			count++;
		}
		System.out.println();
		System.out.println("You made it... and now you have " + count + " childrens.");
	}
}

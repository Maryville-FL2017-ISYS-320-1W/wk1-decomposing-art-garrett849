/*
  	ISYS 320
  	Name(s): Garrett Weissenborn
  	Date: 11/2/2017
*/

// 4. Your pseudocode algorithm for how to break down the figure


public class StarFigures {

	public static void main(String[] args) {
		draw2lines();
	

	}
	
	//Make two lines of stars
	public static void draw2lines() {
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 5; j++) {
			System.out.print("*");
		}
			System.out.println();
	}
}
}
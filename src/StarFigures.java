/*
  	ISYS 320
  	Name(s): Garrett Weissenborn
  	Date: 11/2/2017
*/

// 4. Your pseudocode algorithm for how to break down the figure


public class StarFigures {

	public static void main(String[] args) {
		draw2lines();
		drawX();
		System.out.println("");
		System.out.println("");
		draw2lines();
		drawX();
		draw2lines();
		System.out.println("");
		System.out.println("");
		draw_vertical_line();
		draw2lines();
		drawX();
	}
	
	//Make two lines of stars.
	public static void draw2lines() {
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 5; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	//Draw a X.
	public static void drawX() {
		System.out.println(" * *");
		System.out.println("  *");
		System.out.println(" * *");
	}
	//Draw vertical line.
	public static void draw_vertical_line() {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 1; j++) {
			System.out.print("  *");
			}
			System.out.println();
			}
	}	
}
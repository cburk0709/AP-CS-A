/*
	*Thomas Pentimonti
	*AP CS A
	*Period 1
	*October 8th, 2018
	*Rocket Project
 */
public class RocketProject {

    public static final int SIZE = 4;
    //Prints the rocket
    public static void main(String[] args) {
        cone();
        Line();
        topSection();
        line();
        bottomSection();
        Line();
        conePart();
    }
  
    public static void cone() {   //Prints the cone at the top and bottom
			for(int j = 1; j <= (SIZE * 2 - 1); j++) {
				for(int i = j; i <= (SIZE * 2 - 1); i++) {
					System.out.print(" ");
				}
				for(int i = 1; i<= j; i++) {
					System.out.print("/");
				}
				System.out.print("**");
				for(int i = 1; i <= j; i++) {
					System.out.print("\\");
				}
				System.out.println(" ");
			}
    }
    
    public static void topSection() { //Combines cone methods to make one design inside top section
        upDesign();
        downDesign();
    }
   
    public static void bottomSection() { //Combines methods in a different order to make a different design in the bottom section 
        downCone();
        upCone();
    }
    
    public static void upDesign() { //prints inside design facing up
			for(int i = 1; i <= SIZE; i++) {
				System.out.print("|");
				for(int b = 1; b <= 2; b++) {
					for(int j = i; j < SIZE; j++) {
						System.out.print(".");
					}
					for(int j = 1; j <= i; j++) {
						System.out.print("/\\");
					}
					for(int j = i; j < SIZE; j++) {
						System.out.print(".");
					}
				}
				System.out.println("|");
				}
			}
    
    public static void downDesign() { //prints inside design facing down
			for(int i = 0; i < SIZE; i++) {
				System.out.print("|");
				for(int b = 1; b <= 2; b++) {
					for(int j = 1; j <= i; j++) {
						System.out.print(".");
					}
					for(int j = i; j < SIZE; j++) {
						System.out.print("\\/");
					}
					for(int j = 1; j <= i; j++) {
						System.out.print(".");
					}
				}
				System.out.println("|");
			}
    }
   
    public static void line() {  //prints line
        System.out.print("+");
	for(int i = 1; i <= (SIZE * 2); i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
}

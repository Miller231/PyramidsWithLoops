/* 
 * Austin Miller
 * mille5au@mail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5; // Declaring how many lines of our pyramid we want
		for (int i = 1, l = 5, j = 1; i <= lines; i++, l--, j=j+2) { // Loop to set up incrementing
			for (int m = 1; m <= l; m++) { // inner loop to provide correct spacing
				System.out.print(" ");
			}
			for (int k = 1; k <= j; k++) { // inner loop to provide correct starting number
				System.out.print(i);
			}
			System.out.println(); // Prints space in between lines
		}
	}
}

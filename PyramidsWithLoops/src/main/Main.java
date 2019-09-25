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
		int lines = 5;
		for (int i = 1, j = 1; i <= lines; i++, j=j+2) {
			for (int k = 1; k <= j; k++) {
				System.out.print(i);
			}

			System.out.println();
		}
	}
}

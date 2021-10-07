
package bowling;

import java.util.Scanner;


//@author sak5680

public class Bowling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] scores = new int[3];
        
        for (int i = 0; i < 3; i++){
            System.out.print("Enter next score: ");
            scores[i] = in.nextInt();
        }
        
        int total = 0;
        for (int element : scores) {
            System.out.println(element);
            total += element;
        }
        
        System.out.println("Total: " + total);
    }

}

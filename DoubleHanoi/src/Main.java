import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // create Random obj rand
        Random rand = new Random();

        // create Scanner obj scan
        Scanner scan = new Scanner(System.in);

        // read in number of disks from the user
        System.out.println("Input the number of disks you would like to use: ");
        int disks = scan.nextInt();

        // array of disk sizes
        int[] a = new int[disks];

        // populate a
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(1, 50000);
        }

        // populate value for R
        int r = rand.nextInt(1,1000000000);

        // populate value for L
        int l = rand.nextInt(1,1000000000);

        // create Solution obj sol
        Solution sol = new Solution(a, l, r);

        // call count & print methods
        sol.countDisks();
        sol.printData();
    }
}
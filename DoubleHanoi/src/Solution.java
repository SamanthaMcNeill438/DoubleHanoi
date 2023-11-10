import java.util.Scanner;

public class Solution {

    private int[] A;
    private int L, R, count, countL, countR;

    public Solution(int[] a, int l, int r) {
        A = a;
        L = l;
        R = r;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public void countDisks(){
        // loop through a
        for(int i = 0; i < A.length; i++){
            // if a < l add to total
            if(A[i] < L){
                count++;
                countL++;
            }
            // if a < R add to total
            if(A[i] > R){
                count++;
                countR++;
            }
        }
    }

    public void printData(){

        // Print array A of disk sizes
        System.out.print("Disk Size: ");
        for(int i = 0; i < A.length; i++){
            System.out.print("   " + A[i]);
        }

        System.out.printf("\nInitial Base R: %d \n", R);
        System.out.printf("Initial Base L: %d \n", L);


        // print info
        System.out.printf("Right Pole: %d \nLeft Pole: %d \nTotal Disks: %d", countR, countL, count);
    }

}

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n;
        int temp = 0;
        int q = sc.nextInt();
        for(int k=1;k<=q;k++){
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    temp += ((int)Math.pow(2, j) * b);
                }
                System.out.print(a + temp + " ");
                temp = 0;
            }
            System.out.println();
        }



    }
}
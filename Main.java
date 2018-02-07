import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    //You are given a sequence whose nth term is T(n)=n^2-(n-1)^2 . Find S(n) mod(10^9 + 7)

    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long n;
        long sum;

        for(int i=0;i<t;i++){
            n = input.nextLong();
            sum = ((n%mod)*(n%mod)) % mod; 
            System.out.println(sum);
            }   
        }
}
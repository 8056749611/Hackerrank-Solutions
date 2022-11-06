import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //Number of scores
        
        int hi = in.nextInt();
        int lo = hi;
        int max = 0;
        int min = 0;
        
        for(int score=1; score < n; score++){
            int s = in.nextInt();
            
            if(s > hi){
                hi = s;
               max++;
            }
            
            if(s < lo){
                lo = s;
                min++;
            }
        }
        System.out.println(max + " " + min);
    }
}
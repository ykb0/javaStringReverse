import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] array = A.toCharArray();
        String str = "";
        for(int i=A.length()-1;i>=0;i--){
            str = str + array[i];
        }
        if(A.equalsIgnoreCase(str))System.out.println("Yes");
        else System.out.println("No");
}
}




package Muthyam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {
    public static void main(String[] args) throws IOException {
        String str;
        String reversed = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        str = br.readLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--)
        {
            reversed = reversed + str.charAt(i);

        }
        if (str.equals(reversed)) {
            System.out.println("It is a polindrome");
        } else {
            System.out.println("It is not a polindrome");
        }
    }
}
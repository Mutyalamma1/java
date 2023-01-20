package Muthyam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        long fact=1;
        int num;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value");
        num=Integer.parseInt(br.readLine());
        for (int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

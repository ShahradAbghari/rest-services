package com.example.demo;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Test {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N % 2 == 0 && N > 20)
            System.out.println("Not Weird");
        else if (N % 2 == 0 && N >= 2 && N <= 5)
            System.out.println("Not Weird");
        else if (N % 2 == 0 && N <= 20 && N >= 6)
            System.out.println("Weird");
        else if (N % 2 > 0)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");


    }
}

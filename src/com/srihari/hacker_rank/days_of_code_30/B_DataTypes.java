package com.srihari.hacker_rank.days_of_code_30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/domains/tutorials/30-days-of-code
 */
public class B_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        double y = scan.nextDouble();
        scan.nextLine();
        String z = scan.nextLine();

        System.out.println(i + x);
        System.out.println(d + y);
        System.out.println(s.concat(z));

        scan.close();
    }
}

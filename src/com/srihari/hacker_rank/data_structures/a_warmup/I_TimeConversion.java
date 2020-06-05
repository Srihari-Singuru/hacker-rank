package com.srihari.hacker_rank.data_structures.a_warmup;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class I_TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String prefix = s.substring(0, s.length()-2);
        String suffix = s.substring(s.length()-2);
        String[] segments = prefix.split(":");

        if(suffix.equalsIgnoreCase("AM") && segments[0].equalsIgnoreCase("12")){
            segments[0] = "00";
        }
        if(suffix.equalsIgnoreCase("PM") && Integer.parseInt(segments[0]) < 12){
            segments[0] = String.valueOf(Integer.parseInt(segments[0]) + 12);
        }

        return segments[0]+":"+segments[1]+":"+segments[2];
    }

    public static void main(String[] args) {
        String result = timeConversion("07:05:45PM");
        System.out.println(result);
    }
}

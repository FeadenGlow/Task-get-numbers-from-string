package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        System.out.println(getAllNumbers("data 48 call 9 read13 blank0a"));
    }
    public static String getAllNumbers(String text){
        Pattern pattern = Pattern.compile("(\\d+)");
        int j = 0;
        Matcher matcher = pattern.matcher(text);
        int a[] = new int[(int) pattern.matcher(text).results().count()];
        while (matcher.find()) {
            int i = Integer.parseInt(text.substring(matcher.start(), matcher.end())) * 2;
            a[j] = i;
            j++;
        }
        return Arrays.toString(a);
    }
}

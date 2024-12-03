package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("123455432"));
    }
public static Boolean checkForPalindrome(String x ){
     String y = x.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
    LinkedList<Character> cleanStr = new LinkedList<>();
    for (char c : y.toCharArray()){
        cleanStr.add(c);
    }
    while (cleanStr.size()>1){
        if (!cleanStr.pollFirst().equals(cleanStr.pollLast()))
            return false;
    }
    return true;
}

public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (decimal>0){
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal / 2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit : binaryList){
            stringBuilder.append(digit);
        }
        return  stringBuilder.toString();

}
}
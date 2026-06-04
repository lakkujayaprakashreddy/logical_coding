package Revise;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class reversewithoutSpecialChar {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the String:");
        String input=scn.nextLine();
        System.out.println(reverse(input));
    }
    public static String reverse(String input){
        List<Character> result=input.chars()
                .mapToObj(c->(char)c)
                .filter(c->Character.isLetter(c))
                .collect(Collectors.toList());
        Collections.reverse(result);
        Iterator<Character> iterator=result.iterator();
        return input.chars()
                .mapToObj(c->(char)c)
                .map(c->Character.isLetter(c)?iterator.next():c)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}

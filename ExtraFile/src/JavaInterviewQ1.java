import java.io.*;
import java.util.*;
public class JavaInterviewQ1 {


    public static void isAnagrams(String strOne, String strTwo){


        int strOneLen = strOne.length();
        int strTwoLen = strTwo.length();

        if(strOneLen != strTwoLen){

            System.out.println("Length not matched String one is not ANAGRAM of String Two");
        }else{

            for(int i =0; i < strOneLen; i++) {
                char strOneChar = strOne.charAt(i);
                if (strTwo.contains(Character.toString(strOneChar))) {
                    if(i == (strOneLen-1)){
                        System.out.println("String one is ANAGRAM of String Two");
                    }
 
                   // System.out.println(strOneChar + "   is present in string two");
                }else{
                    System.out.println("String one is not ANAGRAM of String Two");
                    break;
                }
            }

        }


    }
public static void main(String[] args){

        String str1 = "Imran";
        String str2 = "Imrna";

        isAnagrams(str1, str2);

    //Two Strings are anagrams if they have similar letters without having order necessarily




}


}

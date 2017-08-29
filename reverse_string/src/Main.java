import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        stringReversal("Ahamed Ifham");
        String reveresedWordsTest = reversedWords("I am going out");
        String reversedStringTest = reversedString("Reverse this string");

        System.out.println(reveresedWordsTest);
        System.out.println(reversedStringTest);

    }

    public static void stringReversal(String word){
        String reversedWord = "";

        for (int i = word.length()-1; i>=0 ; i--){
            reversedWord += word.charAt(i);
        }

        System.out.println("Reversed word is " + reversedWord);
    }

    public static String reversedWords(String sentence){
        List<String> words = Arrays.asList(sentence.split(" "));
        //Collections.reverse(words);
        StringBuilder sb = new StringBuilder(sentence.length());

        for(int i = words.size()-1; i>=0;i--){
            System.out.println(words.get(i) + " is for i = " + i);
            sb.append(words.get(i));
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static String reversedString(String sentence){
        if(sentence.trim().isEmpty()){
            return sentence;
        }

        StringBuilder reverse = new StringBuilder();
        String[] sa = sentence.trim().split(" ");
        for(int i = sa.length-1; i>=0 ; i--){
            reverse.append(sa[i]);
            reverse.append(' ');
        }

        return reverse.toString().trim();
    }
}

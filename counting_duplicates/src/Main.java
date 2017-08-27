import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String args[]){
//        printDuplicateCharachters("Programming");
//        printDuplicateCharachters("Java");
//        printDuplicateCharachters("Ahamed");
        printDuplicateWithoutExtraDataStrcuture("Programming");


    }

    public static void printDuplicateCharachters(String word){
        char[] charachters = word.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(Character ch: charachters){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            }else{
                charMap.put(ch,1);
            }
        }

        // Iterate through HashMap to print all duplicate characters of String

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.println("Print duplicate charachters");
        for (Map.Entry<Character, Integer> entry: entrySet){
            if(entry.getValue()>1){
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static void printDuplicateWithoutExtraDataStrcuture(String word){
        String res = "";
        while(word.length()>0){
            int c=0;
            for(int j=0; j<word.length();j++){
                if (word.charAt(0) == word.charAt(j)){
                    c=c+1;
                }

            }
            res = res + word.charAt(0) + "=" + c + "\n";
            String k[] = word.split(word.charAt(0) + "");
            System.out.println("String k is " + k);
            word=new String("");
            for (int i=0; i<k.length;i++){
                word = word + k[i];
            }
        }
        System.out.println(res);
    }
}

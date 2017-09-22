import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main{
  public static void main(String[] args) {
    printDuplicateCharachters("Programming");
  }

  public static void printDuplicateCharachters(String word){
    char[] charachters = word.toCharArray();
    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
    for (Character ch:charachters ) {
      if (charMap.containsKey(ch)) {
        charMap.put(ch, charMap.get(ch) + 1);
      }else {
        charMap.put(ch,1);
      }
    }

    //Iterate through the HashMap to print duplicate charachters
    Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
    System.out.println("Print duplicate charachters");
    for (Map.Entry<Character, Integer> entry :entrySet ) {
      if (entry.getValue()>1) {
        System.out.print(entry.getKey() + " " + entry.getValue());
      }
    }

  }
}

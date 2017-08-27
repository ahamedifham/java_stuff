import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean c1= checkAnagrams("mary", "ray");
        System.out.println(c1);
        boolean c2 = checkAnagramMethodII("mary", "ramy");
        System.out.println(c2);

        boolean c3 = checkAnagramMethodIII("mary", "rmy");
        System.out.println(c3);
    }

    public static boolean checkAnagrams(String word, String anagram){

        if(word.length() != anagram.length()){
            return false;
        }

        char chars[] = word.toCharArray();
        for (char c:chars){
            int index = anagram.indexOf(c);

            if (index != -1){
                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
            }else {
                return false;
            }
        }
        return anagram.isEmpty();

    }

    public static boolean checkAnagramMethodII(String word, String anagram){
        char charFromWord[] = word.toCharArray();
        char charFromAnagram[] = anagram.toCharArray();

        Arrays.sort(charFromAnagram);
        Arrays.sort(charFromWord);

        return Arrays.equals(charFromAnagram,charFromWord);
    }

    public static boolean checkAnagramMethodIII(String first, String second){
        char charachters[] = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);

        for (char ch : charachters){
            int index = sbSecond.indexOf("" + ch);
            if (index != -1){
                sbSecond.deleteCharAt(index);
            }else{
                return false;
            }
        }

        return sbSecond.length()==0 ? true : false;
    }
}

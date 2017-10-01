import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Main{
  public static void main(String[] args) {
    String s1="abcacbbbca";
    subPal(s1);
  }

  public static void subPal(String str){
    String s1="";
    int N = str.length();
    int count=0;
    Set<String> palindromeArray =  new HashSet<String>();
    System.out.println("Given String : " + str);
    for (int i=2; i<=N; i++) {
      for (int j=0; j<=N; j++) {
        int k= i+j-1;
        if (k>=N) {
          continue;
        }
        s1 = str.substring(j,i+j);
        if (s1.equals(new StringBuilder(s1).reverse().toString())) {
          palindromeArray.add(s1);
        }
      }
    }
    for (String s :palindromeArray ) {
      System.out.println(s + " - is a Palindrome String");
    }
  }
}

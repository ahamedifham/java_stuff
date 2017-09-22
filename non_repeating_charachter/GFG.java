class GFG{
  static final int NO_OF_CHARS = 256;
  static char count[] = new char[NO_OF_CHARS];

  public static void main(String[] args) {
    String str = "geeksforgeeks";
    int index = firstNonRepeating(str);

    System.out.println(index == -1 ? "Either all chars are repeating or null" :
                      "First Non repeating char is " + str.charAt(index));
  }

  static int firstNonRepeating(String str){
    getCharCountArray(str);
    int index= -1,i;
    for (i=0; i<str.length() ;i++ ) {
      index= i;
      break;
    }
    return index;
  }

  static void getCharCountArray(String str){
    for (int i=0; i<str.length(); i++) {
      System.out.println("str.charAt(i) before executing: " + i + " - " + count[str.charAt(i)]  + str.charAt(i));
      count[str.charAt(i)]++;
      System.out.println("str.charAt(i) after executing: " + i + " - " + count[str.charAt(i)] );
    }
  }
}

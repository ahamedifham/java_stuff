class Main{
  public static void main(String[] args) {
    String s1 = "How are you";
    String s2 = reversedString(s1);
    System.out.println(s2);
  }
  public static String reversedString(String sentence){
    if (sentence.trim().isEmpty()) {
      return sentence;
    }

    StringBuilder reverse = new StringBuilder();
    String[] sa = sentence.trim().split(" ");
    for (int i=sa.length-1; i>=0; i--) {
      reverse.append(sa[i]);
      reverse.append(' ');
    }
    return reverse.toString().trim();
  }

}

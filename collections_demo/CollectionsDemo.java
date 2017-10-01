import java.util.*;
public class CollectionsDemo{
  public static void main(String[] args) {
    //Arrayist
    List<String> a1= new ArrayList<String>();
    a1.add("Zara");
    a1.add("Mahnaz");
    a1.add("Ayan");
    System.out.print("\t" + a1);

    Set<String> s1= new HashSet<String>();
    s1.add("Zara");
    s1.add("Mahnaz");
    s1.add("Ayan");
    System.out.println();
    System.out.print("\t" + s1);

    Map<String, String> m1 = new HashMap<String, String>();
    m1.put("Zara","8");
    m1.put("Mahnaz","31");
    System.out.println();
    System.out.print("\t" + m1);
  }
}

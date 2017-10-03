import java.util.*;
public class SetDemo{
  public static void main(String[] args) {
    int count[] = {34,22,10,60,30,22};
    Set<Integer> set = new HashSet<Integer>();
    try{
      for (int i=0; i<5; i++) {
        set.add(count[i]);
      }
      System.out.println(set);

      TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
      System.out.println(sortedSet);

      System.out.println(sortedSet.first());
      System.out.println(sortedSet.last());

      SortedSet<String> sset = new TreeSet<String>();
      sset.add("b");
      sset.add("c");
      sset.add("a");

      Iterator it = sset.iterator();
      while(it.hasNext()){
        Object element = it.next();
        System.out.println(element.toString());
      }

    }
    catch(Exception e){}
  }
}

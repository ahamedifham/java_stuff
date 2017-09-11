import java.util.HashSet;

class GFG{
  public static void main(String[] args) {
    int arr1[] = {11,1,13,21,3,7};
    int arr2[] = {11,3,7,1,4};

    int m = arr1.length;
    int n = arr2.length;

    if (isSubset(arr1, arr2, m, n)) {
      System.out.println("Arr2 is a subset of Arr1");
    }else {
      System.out.println("Arr2 is not a subset of Arr1");
    }
  }

  static boolean isSubset(int arr1[], int arr2[], int m, int n){
    HashSet<Integer> hset = new HashSet<Integer>();
    //hset stores all the values of arr1
    for (int i=0; i<m;i++ ) {
      if (!hset.contains(arr1[i])) {
        hset.add(arr1[i]);
      }
    }

    for (int i=0; i<n; i++) {
      if (!hset.contains(arr2[i])) {
        return false;
      }
    }
    return true;
  }
}

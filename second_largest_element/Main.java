class Main{
  public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7,8,9,10};
    int secondLargestElement = secondElement(a);
    System.out.println(secondLargestElement);
  }

  public static int secondElement(int a[]){
    int i, max1,max2;
    max1= a[0]; max2=a[1];
    for (i=1;i<a.length ;i++ ) {
      if (a[i]>max1) {
        max2=max1;
        max1=a[i];
      }else if (a[i]>max2 && a[i]!=max1) {
        max2 = a[i];
      }else if (max1 ==max2) {
        max2 =a[i];
      }
    }
    return max2;
  }
}

class MyFibonacci{
  static int n1=0,n2=1,n3=0;

  public static void main(String[] args) {
    // int fibNo = fibonacciRecursion(10);
    // System.out.println("The fibonacci number of 10 is " + fibNo );

    int count = 10;
    System.out.print(n1 + " " + n2);
    printFibonacci(count-2);
  }

  public static int fibonacciRecursion(int number){
    if (number ==1 || number==2) {
      return 1;
    }
      return fibonacciRecursion(number-1) + fibonacciRecursion(number-2);
  }

  public static void printFibonacci(int count){
    if (count>0) {
      n3=n1+n2;
      n1=n2;
      n2=n3;
      System.out.print(" " + n3);
      printFibonacci(count-1);
    }
  }


}

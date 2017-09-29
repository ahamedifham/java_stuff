class ReverseArray{
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
    printArray(arr,6);
    reverseArray(arr,0,5);
    System.out.println("Revesed Array is ");
    printArray(arr,6);
  }

  static void printArray(int arr[], int size){
    for (int i=0; i<size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("");
  }

  static void reverseArray(int arr[], int start, int end){
    int temp;
    if (start>=end) {
      return;
    }
    temp = arr[start];
    arr[start] = arr[end];
    arr[end]= temp;
    printArray(arr,6);
    reverseArray(arr, start+1, end-1);
  }
}

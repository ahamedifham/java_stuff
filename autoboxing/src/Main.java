import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>()

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();

        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i=0; i<10;i++){
            intArrayList.add(Integer.valueOf(i));  //valueOf() takes the data of the primitive type and convert it to the class type
            //Autoboxing
        }

        for(int i=0; i<=10; i++){
            System.out.println(i + " -->" + intArrayList.get(i).intValue()); //intValue() convert it back to int type
            //Unboxing
        }

        Integer myIntValue =  56; //Integer.valueOf(56) this automatically happens
        int myInt = myIntValue; //myIntValue.intValue()

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for(double db = 0.0; db<=10.0; db +=0.5){
            myDoubleValue.add(Double.valueOf(db));
        }

        for(int i=0; i<myDoubleValue.size();i++){
            double value = myDoubleValue.get(i).doubleValue();
            System.out.println(i + " --->" + value);
        }

    }
}

package lesson20_List.IntroGenerik;

import java.util.Arrays;

public class Box {
    private Object[]values;
    public Box(Object[]input){
        this.values = new Object[input.length];
        System.arraycopy(input,0,values,0,input.length);
        //this.values = Arrays.copyOfRange(input,0,input.length);
    }
    public Object getN(int n){
        return values[n];
    }
    public void setN(Object obj, int n){
        values[n]=obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}

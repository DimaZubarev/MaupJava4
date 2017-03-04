package lesson5;

public class Task5_2 {
    public static void main(String[] args) {
        String input = "22.11.1963";
        String output;

        System.out.println(input);
        // var1
        int n1 = input.indexOf(".");
        int n2 = input.indexOf(".", n1 + 1);
        output = input.substring(n2 +1) + "." + input.substring(n1 + 1, n2) + "." + input.substring(0, n1);
        System.out.println("var1 = " + output);

        //var2
        String[] parts = input.split("\\."); // "\\." два обратных сплеша это разре, а "." показуем по какому символу
        output = parts[2]+ "."+ parts[1]+"."+parts[0];
        System.out.println("var2 = " + output);


    }
}

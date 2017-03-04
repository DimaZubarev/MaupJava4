package lesson11_oop5_polymorhysm.hw;
public class Task1 {
    public static void main(String[] args) {
        String s = "  Hello   from   us!  ";
        System.out.println(delSpaces(s));
    }
    static String delSpaces(String input){
        StringBuilder sb = new StringBuilder(input);
//        for(; ;) {
//            int flag = 0;
//            for (int i = 1; i < sb.length(); i++) {
//                if ((sb.charAt(i - 1) == ' ') && (sb.charAt(i) == ' ')) {
//                    sb.replace(i - 1, i + 1, " ");
//                    flag++;
//                }

//            }
//            if (flag == 0) {return sb.toString();}
//        }
        // варіант Андрія
        int n = -1;
        n = sb.indexOf("  ");
        while (n >=0){
            sb.deleteCharAt(n);
            n = sb.indexOf("  ");
        }
        return sb.toString();
    }

}

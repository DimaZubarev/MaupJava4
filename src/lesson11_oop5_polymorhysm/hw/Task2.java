package lesson11_oop5_polymorhysm.hw;

public class Task2 {
    public static void main(String[] args) {
        String s = "H.e.l.l.o. w.o.r.d";
        System.out.println(removalPoint(s));
        System.out.println(replacePoint(s));
    }
    static String removalPoint(String input){
        StringBuilder sb = new StringBuilder("H.e.l.l.o. w.o.r.d");
        for (int i = 0; i <sb.length(); i++) {
            if(sb.charAt(i) == '.'){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    static String replacePoint(String input){
        StringBuilder sb = new StringBuilder("H.e.l.l.o. w.o.r.d");
        for (int i = 0; i <sb.length(); i++) {
            if(sb.charAt(i) == '.'){
                sb.setCharAt(i, '/');
            }
        }
        return sb.toString();
    }
}

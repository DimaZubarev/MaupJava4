package lesson16_oop_enams.enams;

import java.util.Arrays;

import static lesson16_oop_enams.enams.Season.AUTUMN;
import static lesson16_oop_enams.enams.Season.WINTER;

public class EnamTest {
    public static void main(String[] args) {
        Season w = WINTER;
        // enum -> String
        System.out.println(w);
        System.out.println(w.toString());
        System.out.println(w.name());
        System.out.println();
        // String -> enam
        Season w1 = Season.valueOf("WINTER");
        System.out.println(w1);
        System.out.println();
        System.out.print("All seasons = ");
        System.out.println(Arrays.toString(Season.values()));
        System.out.println();
        // index -> enum
        System.out.println("1st seasons is");
        System.out.println(Season.values()[0]); //
        
        System.out.println();
        //enum -> index
        System.out.print("Summer is number ");
        System.out.print(Season.SUMMER.ordinal() + 1);
        System.out.println(" season");
        System.out.println();
        System.out.println("Season, next to Autumn is ");
        System.out.println(nextSeasons(Season.AUTUMN));

    }
    // метод що виводить наступний місяць
    static Season nextSeasons(Season season){
         if( season.equals(Season.AUTUMN))return WINTER;
         return Season.values()[season.ordinal()+1];
    }
   /* public Season prevSeason(){
        if(this.equals(WINTER)) return AUTUMN;
        return Season.values()[this.ordinal()-1];
    }*/

}

package lesson13_oop_interface;

import java.util.Arrays;

public class Route {
    private String[]points;

    public Route(String[] p) {
        // this.points = p непотрібно так робити, порушує інкапсуляцію
        this.points = new String[p.length];
        for (int i = 0; i < p.length; i++) {
            this.points[i] = points[i];
        }
    }


    @Override
    public String toString() {
        return "Route{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    public static void main(String[] args) {
        Route route1 = new Route(new String[]{"Kyiv", "Vinnytsya", "Lviv"});
        Route route2 = new Route(new String[]{"Kyiv", "Vinnytsya", "Lviv", "Uzhgorod"});

        System.out.println(route1);
        System.out.println(route2);
    }

}

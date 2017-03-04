package lesson12_oop_abstract_class.animals;

import lesson11_oop5_polymorhysm.access_modifiers.pack.A;

public class AnimalTest {
    public static void main(String[] args) {
        Bird[]birds = new Bird[3];
        Fish[]fishs = new Fish[2];
        Animal[]animals = new Animal[birds.length + fishs.length];
        Swim[]swimers = new Swim[3];

        swimers[0] = new Penguin("King penguin", 14, true,  -25);
        swimers[1] = new Shark("Tiger shark", 310, false, 999);
        swimers[2] = new Brama("Brama danubii", 2.9, true, 19);

        birds[0] = new Owl("Wise owl", 1.5, true, 4000);
        birds[1] = new Eagle("Eagle old", 4.5, true, 130);
        birds[2] = new Penguin("King penguin", 15, true,  -20);
        fishs[0] = new Shark("Tiger shark", 300, false, 1000);
        fishs[1] = new Brama("Brama danubii", 2.5, true, 20);
        animals[0] = birds[0];
        animals[1] = birds[1];
        animals[2] = fishs[0];
        animals[3] = fishs[1];
        animals[4] = birds[2];

        for (Animal animal : animals) {
           animal.eat();
           animal.sound();
            System.out.println(animal.info());
        }
        for (Bird bird : birds) {
            bird.madeEggs();
        }
        for (Fish fish : fishs) {
            fish.swim();
        }
//        Animal[]swimers = new Animal[3];
//        for (Animal swimer : swimers) {
//            ((Swim)swimer).swim();
//        }
        for (Swim swimer : swimers) {
            swimer.swim();
        }
        System.out.println(animals[1].info());

    }
}

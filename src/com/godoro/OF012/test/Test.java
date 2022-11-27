package com.godoro.OF012.test;

import com.godoro.OF012.features.Flyable;
import com.godoro.OF012.toys.Plane;
import com.godoro.OF012.toys.Toy;
import com.godoro.OF012.zoo.*;

public class Test {


    /*private static void makeFly(Bird bird) {
        System.out.println("Uç");
        bird.fly();
        System.out.println("Kon");
        bird.land();
    }*/ // Inheritance gördüğümüz şekilde yapsaydık bu doğruydu yani super class'tan oluşturulan bir method
    // child classlar tarafından kullanılabilir, fakat burada Bat Bird için bir child class değil ama o da
    // uçabiliyor o zaman bu methodun Bat için de kullanılabilmesi (ya da ileride eklenebilecek Bird türünden
    // farklı ama uçabilen bir sınıf için de geçerli olması için buradaki parametreleri Interface olan
    // Flayable ile değiştirerek aşağıdaki gibi yazdık.

    private static void makeFly(Flyable flyable) {
        System.out.println("Uç");
        flyable.fly();
        System.out.println("Kon");
        flyable.land();
    }

    public static void main(String[] args) {


        Pigeon pigeon = new Pigeon("Taklacı");
        pigeon.fly();
        pigeon.land();

        Hawk hawk = new Hawk("Black Hawk");
        hawk.fly();
        hawk.land();

        Bird bird = new Pigeon("Paçalı");
        bird.fly();
        bird.land();

        Flyable flyable = new Pigeon("Postacı");
        flyable.fly();
        flyable.land();

        System.out.println("---------------------------");

        Bat bat = new Bat("Dark Knight");
        bat.fly();
        bat.land();

        Mammal mammal = new Bat("Robin");
       /* mammal.fly();
        mammal.land();*/ // Mammal uçamaz, ve o method zaten orada tanımlı değil, burada Bat hayvan olarak
        // tanımlandı, sadece hayvan özellikli Bat uçamaz, ama hayvandır nihayetinde :)

        Flyable flyable2 = new Bat("Vampire");
        flyable2.fly();
        flyable2.land();

        System.out.println("-------------------------");

        Plane plane = new Plane("THY",4000);
        plane.fly();
        plane.land();


        System.out.println("-------------------------");

        makeFly(pigeon);
        makeFly(bird);
        makeFly(hawk);
        makeFly(bat);
        makeFly(plane);

        Toy plane2 = new Plane("THY2",243232);
        plane.setPrice(34234234);
        plane2.setPrice(434343);


    }
}

package org.example._27_11_2024;

public class Personnn {

    Personnn friend;

    public static void main(String[] args) {
        Personnn p1 = new Personnn();
        Personnn p2 = new Personnn();
        Personnn famous = new Personnn();
        Personnn p4 = new Personnn();
        Personnn p5 = new Personnn();

        p1.friend = famous;
        p2.friend = famous;
        p4.friend = famous;
        p5.friend = famous;

        System.out.println(famous.friend);
        System.out.println(p1.friend);

        Personnn[] people = {p1, p2, p4, p5, famous};

    }

    boolean isKnown(Personnn p) {
        return this.friend.equals(p);
    }
}

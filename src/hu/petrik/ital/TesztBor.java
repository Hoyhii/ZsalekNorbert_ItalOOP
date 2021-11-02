package hu.petrik.ital;

public class TesztBor {

    public static void kiirBor(Bor bor){
        System.out.println(bor.toString());
    }

    public static void main(String[] args) {

        Bor bor3 = new Bor("bor1",998);
        Bor bor2 = new Bor("bor2",321);
        Aszu aszu = new Aszu(1882,10);
        Aszu aszu2 = new Aszu(133,15);
        kiirBor(bor3);
        kiirBor(aszu);
        kiirBor(aszu2);
        kiirBor(bor2);
    }
}


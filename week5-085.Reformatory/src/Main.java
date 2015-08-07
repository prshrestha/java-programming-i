
public class Main {
//to test the first part
//    public static void main(String[] args) {
//        Reformatory eastHelsinkiReformatory = new Reformatory();
//
//        Person brian = new Person("Brian", 1, 110, 7);
//        Person pekka = new Person("Pekka", 33, 176, 85);
//
//        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
//        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
//    }

//    public static void main(String[] args) {
//        Reformatory eastHelsinkiReformatory = new Reformatory();
//
//        Person brian = new Person("Brian", 1, 110, 7);
//        Person pekka = new Person("Pekka", 33, 176, 85);
//
//        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
//        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
//
//        eastHelsinkiReformatory.feed(brian);
//        eastHelsinkiReformatory.feed(brian);
//        eastHelsinkiReformatory.feed(brian);
//
//        System.out.println("");
//
//        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
//        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
//    }
    public static void main(String[] args) {
        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);

        System.out.println("total weights measured " + eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);

        System.out.println("total weights measured " + eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);

        System.out.println("total weights measured " + eastHelsinkiReformatory.totalWeightsMeasured());
    }
}

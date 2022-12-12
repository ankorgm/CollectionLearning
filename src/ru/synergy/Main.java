package ru.synergy;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // Arrays


        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Tomas");
        cats[1] = new Cat("Барсик");
        cats[2] = new Cat("Филлип Маркович");
        cats[3] = new Cat("Котяра");

        //cats[1] = null;


        System.out.println(Arrays.toString(cats));


        //ArrayList

        ArrayList<Cat> catslist = new ArrayList<>();
        for (Cat cat : cats) {
            catslist.add(cat);
        }

        catslist.add(new Cat("Барсик"));

        //catslist.remove(1);

        Cat cat = catslist.get(0);

        System.out.println(cat);

        System.out.println(catslist.indexOf(cat));

        catslist.add(2, cat);
        catslist.set(2, new Cat("Меня сюда вставили"));

        //catslist.removeAll(Arrays.asList(cat, catslist.get(3)));


        System.out.println(catslist.toString());

        System.out.println(catslist.size());


        // LinkedList

        String str1 = new String("Hello world");
        String str2 = new String("My name is Artem");
        String str3 = new String("I love Java");

        LinkedList<String> artemBio = new LinkedList<>();

        artemBio.add(str1);
        artemBio.add(str2);
        artemBio.add(str3);

        System.out.println(artemBio);

        artemBio.remove(1);
        System.out.println(artemBio);

        // Linked list on practice

        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari Spider");
        Car bugatti = new Car("Veyron");
        Car mersedes = new Car("Mersedes Benz");

        cars.addAll(Arrays.asList(ferrari, bugatti, mersedes));

        System.out.println(cars);

        cars.addFirst(new Car("Ford GT300"));
        cars.addLast(new Car("Fiat Ducati"));


        System.out.println(cars);

        System.out.println(cars.pollFirst());
        System.out.println(cars);


        // ArrayList vs LinkedList

       /* List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000000; i++) {
            list.add(new Integer(i));
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для LinkedList в (миллисекундах)" + (System.currentTimeMillis() - start));


        List<Integer> listarray = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) {
            listarray.add(new Integer(i));
        }

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            listarray.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для ArrayList в (миллисекундах)" + (System.currentTimeMillis() - start));

*/


        //Set

        Set<String> states = new HashSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Italy");
        boolean isaddad = states.add("Italy");
        System.out.println("Italy is added" + isaddad);
        System.out.println("Set contains:" + states.size());

        System.out.println(states);

        states.remove("Germany");
        System.out.println(states);


        HashSet<Cat> catHashSet = new HashSet<>(catslist);
        System.out.println(catHashSet);


        TreeSet<Cat> catTreeSet = new TreeSet<>(catslist);
        System.out.println(catTreeSet);


        // Map

        Map<Integer, String> statesMap = new HashMap<>();

        statesMap.clear();
        ;
        statesMap.put(1, "Germany");
        ;
        statesMap.put(2, "Spain");
        ;
        statesMap.put(3, "France");
        ;
        statesMap.put(4, "Italy");
        ;


        System.out.println(statesMap.keySet());

        statesMap.remove(2);

        for (Map.Entry<Integer, String> item : statesMap.entrySet()){
            System.out.printf(  "|Key:   %d   | value:   %s \n", item.getKey(), item.getValue());

        }



        String first = statesMap.get(2);
        System.out.println(first);


    }


}
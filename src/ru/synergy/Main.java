package ru.synergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        // Arrays


        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Tomas");
        cats[1] = new Cat("Бегемот");
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

        catslist.remove(1);

        Cat cat = catslist.get(0);

        System.out.println(cat);

        System.out.println(catslist.indexOf(cat));

        catslist.add(2, cat);
        catslist.set(2, new Cat("Меня сюда вставили"));

        catslist.removeAll(Arrays.asList(cat, catslist.get(3)));


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


    }


}
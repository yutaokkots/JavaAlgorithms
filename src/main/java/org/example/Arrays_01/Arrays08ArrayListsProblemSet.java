package org.example.Arrays_01;

public class Arrays08ArrayListsProblemSet {
    public static void main(String[] args) {

        Arrays08ArrayLists<Integer> Arrays08ArrayLists = new Arrays08ArrayLists<>();
        System.out.println(Arrays08ArrayLists.size());

        Arrays08ArrayLists.add(1);
        System.out.println(Arrays08ArrayLists.get(0));
        System.out.println(Arrays08ArrayLists.size());

        Arrays08ArrayLists.add(2);
        System.out.println(Arrays08ArrayLists.get(1));
        System.out.println(Arrays08ArrayLists.size());

        Arrays08ArrayLists.add(3);
        System.out.println(Arrays08ArrayLists.get(2));
        System.out.println(Arrays08ArrayLists.size());

        System.out.println();

        Arrays08ArrayLists<String> Arrays08ArrayLists2 = new Arrays08ArrayLists<>();
        System.out.println(Arrays08ArrayLists2.size());

        Arrays08ArrayLists2.add("Hi");
        System.out.println(Arrays08ArrayLists2.get(0));
        System.out.println(Arrays08ArrayLists2.size());

        Arrays08ArrayLists2.add("Hello");
        System.out.println(Arrays08ArrayLists2.get(1));
        System.out.println(Arrays08ArrayLists2.size());

        Arrays08ArrayLists2.add("Hey");
        System.out.println(Arrays08ArrayLists2.get(2));
        System.out.println(Arrays08ArrayLists2.size());

        Arrays08ArrayLists2.add("Good morning");
        System.out.println(Arrays08ArrayLists2.get(3));
        System.out.println(Arrays08ArrayLists2.size());
    }

}

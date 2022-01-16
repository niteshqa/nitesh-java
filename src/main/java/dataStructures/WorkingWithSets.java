package dataStructures;

import java.util.*;

public class WorkingWithSets {


    static Person person1 = new Person("Bob", 21);
    static Person person2 = new Person("Mark", 20);
    static Person person3 = new Person("Jill", 32);
    static Person person4 = new Person("Rob", 40);


    public static void setPractice(){

        Set<Person> hashSet = new HashSet ();
        hashSet.add(person1);
        hashSet.add(person1); // SET will remove duplicates
        hashSet.add(person4);
        if (hashSet.contains(person1)){
            hashSet.add(new Person("Beth",18));
            hashSet.remove(person4);
            System.out.println("The set contains" +hashSet);
            }
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.forEach(System.out::println);
    }


    public static void main(String[] args) {
        setPractice();
//        System.out.println("The set contains" );
    }
}


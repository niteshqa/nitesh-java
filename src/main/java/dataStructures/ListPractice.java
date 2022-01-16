package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListPractice {

    public static void listPractice(){

        List list = new ArrayList ();

        list.add("Hello");
        list.add ("World ");

        list.removeAll(list);

        list.add ("This is");
        list.add ("program");

        list.remove("This is");

        if (list.contains("program")) {
            list.add(101);
            System.out.println("list contains: " +list);
        }
        list.remove(1);
        System.out.println("The final array list contains: " +list);

    }

    public static void quePractice(){
        Queue <String> myQue = new LinkedList<>();
        myQue.add ("This is");
        myQue.add("Hello");
        myQue.add ("World ");
        myQue.add ("program");
        System.out.println("The original 1st Que contains: " +myQue.peek());
        myQue.remove("This is");
        System.out.println("The final Que contains: " +myQue);
    }
    public static void linkedListPractice(){
        List<Integer> linked = new LinkedList();
        linked.add(10);
        linked.add(20);
        linked.add(100);
        linked.add(500);

        linked.remove(1);
//        linked.contains(20);
        linked.add(2,200);
        System.out.println("The linked list contains: " +linked);
    }


    public static void main(String[] args) {
        System.out.println("The list contains");
    }
}


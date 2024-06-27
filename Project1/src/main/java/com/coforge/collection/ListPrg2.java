package com.coforge.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListPrg2 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("java");
        list1.add("php");
        list1.add("python");
        list1.add("angular");
        list1.add("react");
        list1.add("python");
        list1.add("java");

        System.out.println("unsorted "+list1);
        Collections.sort(list1);
        System.out.println("sorted "+list1);

        System.out.println("all elements using for loop");
        for (int i = 0; i < list1.size() ; i++) {
            System.out.println(list1.get(i)+", ");
        }
        System.out.println("\njava present in list "+list1.contains("java"));

        System.out.println("\nusing for each ");
        for(String s : list1)
            System.out.println(s+", ");

        ArrayList<String> list2=new ArrayList<String>();
        list2.add("eng");
        list2.add("hindi");
        list2.add("sanskrit");
        list2.add("tamil");
        list2.add("hindi");

        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list1.containsAll(list2));
        list1.removeAll(list2);
        System.out.println(list1);

        LinkedList<Integer> list3=new LinkedList<>();
        list3.add(1001);
        list3.add(1002);
        list3.add(1003);
        System.out.println(list3);

        list3.addFirst(100);
        list3.addLast(200);
        System.out.println(list3);

        list3.remove();
        list3.removeLast();
        System.out.println(list3);
        list3.clear();
        System.out.println(list3);

    }
}

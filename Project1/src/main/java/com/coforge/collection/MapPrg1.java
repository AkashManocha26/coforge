package com.coforge.collection;

import java.util.*;

public class MapPrg1 {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap=new HashMap<>();
        employeeMap.put(1001,"Ram Kumar");
        employeeMap.put(1002,"Raj Kumar");
        employeeMap.put(1003,"Raju Kumar");
        employeeMap.put(1001,"Ramu Kumar");
        System.out.println("1001 is id of "+employeeMap.get(1001));
        System.out.println("1002 is id of "+employeeMap.get(1002));
        System.out.println("1005 is id of "+employeeMap.get(1005));

        System.out.println(employeeMap);
        Set<Integer> keys=employeeMap.keySet();

        for(Integer k:keys)
            System.out.println(k+" ------ "+employeeMap.get(k));

        employeeMap.remove(1001);
        System.out.println(employeeMap.containsKey(1001));
        System.out.println(employeeMap.containsValue("Ramu Kumar"));

        Collection<String> values=employeeMap.values();
        System.out.println(values);

        Set<Map.Entry<Integer,String>> entries=employeeMap.entrySet();
        for (Map.Entry<Integer,String> entry:entries)
            System.out.println(entry.getKey()+"  "+entry.getValue());

    }

}

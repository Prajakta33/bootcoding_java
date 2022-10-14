package com.bootcoding.collection;

import java.util.HashMap;
import java.util.Map;

public class EntrySetExample {
    public static void main(String[] args) {
        HashMap<String,Integer> employee=new HashMap<>();
        for(int i=1;i<=10;i++){
            employee.put("emp"+i,i*1000);
        }
       /* for(String name:employee.keySet()){
            Integer value = employee.get(name);
            System.out.println("EmployeeName:"+name +","+"Salary:"+value);
        }*/
        for(Map.Entry e:employee.entrySet()){
           // e.getKey();
            //e.getValue();
            System.out.println("EmployeeName:"+e.getKey() +","+"Salary:"+e.getValue());
        }
    }
}

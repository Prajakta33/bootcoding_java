package com.bootcoding.collection;

import com.bootcoding.oops.Fan;

import java.util.HashMap;

public class FanCollection {
    HashMap<Long, Fan> fan=new HashMap<>();

    public void addFan(Fan f){
        fan.put(f.getId(), f);
    }

    public void printFan(){
        for(Long key: fan.keySet()){
            Fan f=fan.get(key);
            System.out.println();
            System.out.println("Id:"+f.getId());
            System.out.println("Company:"+f.getCompany());
            System.out.println("Plates:"+f.getPlates());
            System.out.println("Type:"+f.getType());
        }
    }

    public static void main(String[] args) {

        FanCollection object=new FanCollection();
        for (int i=1;i<=10;i++){
            Fan f1=new Fan();
            f1.setId(i);
            f1.setCompany("Usha"+i);
            f1.setPlates(3);
            f1.setType("Table Fan");

            object.addFan(f1);
        }
        object.printFan();

    }
}

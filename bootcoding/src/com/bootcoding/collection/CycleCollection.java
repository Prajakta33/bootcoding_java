package com.bootcoding.collection;

import com.bootcoding.oops.Cycle;

import java.util.HashMap;

public class CycleCollection {
        HashMap<Long, Cycle> cycle=new HashMap<>();


    public void addCycle(Cycle c){
        cycle.put(c.getId(),c);
    }

    public void printCycle(){
        for(Long key:cycle.keySet()){
            Cycle c=new Cycle();
            System.out.println("Id"+c.getId());
            System.out.println("Company"+c.getCompany());
            System.out.println("Wheel"+c.getWheels());
            System.out.println("Color"+c.getColor());
        }
    }

    public static void main(String[] args) {
        CycleCollection obj=new CycleCollection();
        for(int i=1;i<=10;i++){
            Cycle c1=new Cycle();
            c1.setId(i);
            c1.setCompany("Firefox"+i);
            c1.setWheels(2);
            c1.setColor("Red");

            obj.addCycle(c1);

        }
        obj.printCycle();
    }
}

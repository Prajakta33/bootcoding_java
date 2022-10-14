package com.bootcoding.collection;

import com.bootcoding.oops.Marker;

import java.util.HashMap;

public class Markercollection {
    HashMap<Long, Marker> markers=new HashMap<>();
    // Collection of Marker (Key, Value) -> Key:Id and Value: Marker
    // Key: Object, Value: Object

    /*
    * Processing -> Adding one marker into HashMap Collection (markers)
    * */
    public void addMarker(Marker m){
        // Marker ID is Key and Marker object (m) is value
        markers.put(m.getId(),m);
    }

    /*
    * Processing -> Printing all marker objects present in HashMap Collection (markers)
    * */
    public void printMarker(){
        System.out.println("Total markers in collection is " + markers.size());
       for(Long key: markers.keySet()){
           Marker m=markers.get(key);
           System.out.println("Id:"+m.getId());
           System.out.println("Company:"+m.getCompany());
           System.out.println("Type:"+m.getType());
           System.out.println("Color:"+m.getColor());
           System.out.println("Price:"+m.getPrice());
       }
    }



    public static void main(String[] args) {

        // user
        Markercollection object=new Markercollection();
        for(int i=1;i<=10;i++){
            Marker m1=new Marker();
            m1.setId(i);
            m1.setCompany("Marker"+i);
            m1.setType("WhiteBoard");
            m1.setColor("Black");
            m1.setPrice(i*10.5);

            object.addMarker(m1); //

        }
        object.printMarker();
    }
}

package com.bootcoding.oops;

public class Marker {
    public static void main(String[] args) {
    }
        long id;
        String company;
        String color;
        String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    double price;

   // public Marker() {
    //        System.out.println("Marker object created");
//   //     }
//    public Marker(String cmp, String clr) {
//            company = cmp;
//            color = clr;
//        }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
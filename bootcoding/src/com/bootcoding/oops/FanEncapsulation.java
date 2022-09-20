package com.bootcoding.oops;

public class FanEncapsulation {

    public FanEncapsulation(){

    }
   private int speed;
    private int no_of_plates;

    private String color;
    private double price;
    private String company;
    private int Warranty;

    public void setSpeed(int speed){
       this.speed=speed;
    }
    public void setColor(String c){
        //this(keyword)=current object
        this.color=c;
    }
    public void setPrice(double p){
        this.price=p;
    }
    public void setCompany(String cmp){
        this.company=cmp;
    }
    public void setWarranty(int W) {
        this.Warranty = W;
    }
    public void setNo_of_plates(int n){
        this.no_of_plates=n;
    }

    public int getSpeed(){
        return speed;
    }

    public int getNo_of_plates(){
        return no_of_plates;
    }

    public double getPrice(){
        return price;
    }

    public String getColor(){
        return color;
    }

    public String  getCompany(){
        return company;
    }

    public int getWarranty(){
        return Warranty;
    }

}



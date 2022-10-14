package com.bootcoding.dsa.linkedlist;

public class LinklistExample3 {
    public static void main(String[] args){
        Node head=new Node();
        head.data=10;
        head.next=null;
        int count=0;

        Node current=head;

        for(int i=1;i<=10;i++){
            Node n1=new Node();
            n1.data=i*10;
            //n1.next=null;
            current.next=n1;//assign new element to next of current element
            current=current.next;//shift to next element
        }

        current=head.next;
        while (current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;//shift to next element
            count++;
            //System.out.println("count="+count);
        }
        System.out.println("count="+count);

    }
}



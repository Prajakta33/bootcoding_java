package com.bootcoding.collection;

import com.bootcoding.oops.Book;

import java.util.HashMap;

public class BookCollection {
    HashMap<Long, Book> book=new HashMap<>();

    public void addBook(Book b){
        book.put(b.getId(),b);
    }

    public void printBook(){
        for(Long key: book.keySet()){
            Book b=book.get(key);
            System.out.println();
            System.out.println("Id:"+b.getId());
            System.out.println("Page:"+b.getPages());
            System.out.println("Company:"+b.getCompany());
            System.out.println("Type:"+b.getType());
        }
    }

    public static void main(String[] args) {
        BookCollection object=new BookCollection();
        for(int i=1;i<=10;i++){
            Book b1=new Book();
            b1.setId(i);
            b1.setCompany("Classmates"+i);
            b1.setType("Rough Books");
            b1.setPages(200);

            object.addBook(b1);
        }
        object.printBook();
    }


}

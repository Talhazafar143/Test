/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oel_final;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Spring2020
 */
public class Order implements Invoice {
    Scanner input=new Scanner(System.in);
    List <Product>product;
    List<Customer>customer;
    Customer c;
    Product p;
    String date;
    public Order(List<Product> product, List<Customer> customer, Customer c) {
        this.product = product;
        this.customer = customer;
        this.c = c;
    }
    public int Totalamount(){
     int totalprice=0;
        for(Product p:product){
           totalprice+=p.getPrice();
        }
        return totalprice;
    }
    
    public int noofproducts(){
        int noofprod=0;
        try{
        for(Product pr:product){
            noofprod++;
        }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return noofprod;
    }

    public Customer getC() {
        return c;
    }

    public Product getP() {
        return p;
    }
    
   public void generateinvoice(String date){
       System.out.println("\tDate: "+date);
        for(Customer co:customer){
            System.out.println("\tCustomer ID"+co.getId()+"\n\tCustomer Name: "+co.getName());
            
        }
        System.out.println("---------------------------------------------------");
        
            for(Product p:product){
            System.out.println("\tProduct ID"+p.getId()+"\n\tProduct Name: "+p.getName()+"\n\tStock: "+p.getStock());
           System.out.println("\tPrice: "+p.getPrice());
                System.out.println("\t----------");
        }
            System.out.println("--------------------------------");
         System.out.println("\tTotalAmount: "+Totalamount());
        System.out.println("------------------------------------");
    }
public void editorder(){
    System.out.println("What do you want to buy?");
      String prod=input.next();
      p.setName(prod);
}
    

    
}

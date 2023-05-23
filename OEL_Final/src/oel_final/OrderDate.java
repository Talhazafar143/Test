/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oel_final;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Spring2020
 */
public class OrderDate {
  public static void main(String[] args) {
     
      Scanner input=new Scanner(System.in);
      
      Product p1=new Product("Apple",143,"Fruits",170);
         Product p2=new Product("Banana",144,"Fruits",180);
          Product p3=new Product("Apricot",143,"Fruits",280);
            
            List<Product>Fruits=new ArrayList<>();
            Fruits.add(p1);
            Fruits.add(p2);
            Fruits.add(p3);
            
            
            Customer c1=new Customer(1,"Ali Imran","ABC Street, Karachi","0312-936482");
               
               List<Customer>customer=new ArrayList<>();
              
               customer.add(c1);
             
               
               
               Order order=new Order(Fruits,customer,c1);
               String date="9 June 2022";
               order.generateinvoice(date);
               
               System.out.println("Customer Buys: "+order.noofproducts()+" Products.");
                       System.out.println("-------------------------------------");
                       
                   System.out.println("Do you want to edit order?");
                   char rep=input.next().charAt(0);
                   
                       System.out.println("Do you want to edit customer?");
                   char r=input.next().charAt(0);
                       c1.updatecustomer();
               }
        }
     



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
public class Customer {
    Scanner input=new Scanner(System.in);
    int id;
    String name, address,ph_no;
    //List <Product>product;
 public Customer(int id, String name, String address, String ph_no) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ph_no = ph_no;
    }
 
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

   

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPh_no() {
        return ph_no;
    }
    public void updatecustomer(){
        System.out.println("What do you want to update?");
        System.out.println("1)Name 2) Address 3)Phone number");
        char rep=input.next().charAt(0);
        switch(rep){
            case '1':
                name=input.next();
                 System.out.println("Your name has been updated");
                break;
                case '2':
                address=input.next();
                 System.out.println("Your address has been updated");
                break;
                case '3':
                ph_no=input.next();
                 System.out.println("Your phone number has been updated");
                break;
        }
    }
}

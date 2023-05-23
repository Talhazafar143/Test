/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oel_final;

/**
 *
 * @author Spring2020
 */
public class Product {
    String name,stock;
    int price,id;

    public Product(String name, int id, String stock, int price) {
        this.name = name;
        this.id = id;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

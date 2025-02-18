package com.project.E_com_site.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {

    @Id
    private int ProdId;
    private String ProdName;
    private int ProdPrice;

    public Product(){

    }

    public Product(int prodId, String prodName, int prodPrice) {
        ProdId = prodId;
        ProdName = prodName;
        ProdPrice = prodPrice;
    }

    public int getProdId() {
        return ProdId;
    }

    public void setProdId(int prodId) {
        ProdId = prodId;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public int getProdPrice() {
        return ProdPrice;
    }

    public void setProdPrice(int prodPrice) {
        ProdPrice = prodPrice;
    }
}
 
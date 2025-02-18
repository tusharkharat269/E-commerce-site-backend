package com.project.E_com_site.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.E_com_site.Model.Product;
import com.project.E_com_site.Repository.ProductsRepo;

@Service
public class ProductService {

    @Autowired
    ProductsRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int ProdId){
        return repo.findById(ProdId).orElse(null);
    }


    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProdcut(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int ProdId){
        repo.deleteById(ProdId);
    }
}

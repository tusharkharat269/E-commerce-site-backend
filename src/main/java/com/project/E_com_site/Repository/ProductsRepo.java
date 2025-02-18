package com.project.E_com_site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.E_com_site.Model.Product;

@Repository
public interface ProductsRepo extends JpaRepository<Product, Integer>{
}

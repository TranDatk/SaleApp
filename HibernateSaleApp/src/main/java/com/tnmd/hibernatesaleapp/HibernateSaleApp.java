/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tnmd.hibernatesaleapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import pojo.Category;
import repository.ProductRepository;

/**
 *
 * @author admin
 */
public class HibernateSaleApp {

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("kw", "Galaxy");
        
        ProductRepository pre = new ProductRepository();
        pre.getProducts(params).forEach(p -> System.out.printf("%d - %s\n",p.getId(),p.getName()));
        
        
    }
}

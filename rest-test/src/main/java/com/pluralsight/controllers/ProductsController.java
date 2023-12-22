package com.pluralsight.controllers;


import com.pluralsight.DAO.ProductDao;
import com.pluralsight.resttest.Product;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;



@RestController
@RequestMapping("/products")
public class ProductsController {

    private ProductDao productDao;
    private final List<Product> products = Arrays.asList(

            new Product(1, "hot cocoa", 10.99, rs.getDouble("UnitPrice")),
            new Product(2, "tea", 15.99, rs.getDouble("UnitPrice"))

    );

@Autowired
public ProductsController(ProductDao productDao) {
        this.productDao = productDao;
    }
    @RequestMapping(path="/products", method = RequestMethod.GET)
    public List<Product> findAll(){
        return productDao.getAll();
    }

    @RequestMapping(path="/products/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable(name="id") int id, HttpServletResponse response){
        Product p = productDao.getById(id);

        if (p == null){
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
        return p;
    }

    @RequestMapping(path="/products", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Product insert(@RequestBody Product product){


        System.out.println("Incoming product: " + product);

        // TODO Put product in database



        Product p = new Product();
        System.out.println("Returned product: " + p);


        return p;
    }






//    @GetMapping
//    public List<Product> getAllProducts() {
//        return products;
//    }
//    @GetMapping("/{productId}")
//    public Product getProductById(@PathVariable long productId) {
//        return products.stream()
//                .filter(product -> product.getProductId() == productId)
//                .findFirst()
//                .orElse(null);
//    }
}

package de.neuefische.studentdb.controller;

import de.neuefische.studentdb.database.ProductDb;
import de.neuefische.studentdb.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")

public class ProductController {
    ProductDb productDb = new ProductDb();


    @GetMapping
    public List<Product> listProducts() {

        return productDb.getProductList();
    }

    @PutMapping
    public Product addProduct(@RequestBody Product product) {
        return productDb.addProduct(product);
    }
}

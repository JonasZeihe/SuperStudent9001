package de.neuefische.studentdb.controller;

import de.neuefische.studentdb.database.ProductDb;
import de.neuefische.studentdb.model.Product;
import de.neuefische.studentdb.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")

public class ProductController {
    ProductDb productDb = new ProductDb();
    ProductService productService;

    public ProductController() {
        this.productService = new ProductService(this.productDb);
    }

    @GetMapping
    public List<Product> listProducts() {

        return productDb.getProductList();
    }

    @GetMapping("{name}")
    public List<Product> getProductByName(@RequestParam Optional<String> name){
        return productService.getProductList(name.orElse(""));
    }

    @PutMapping
    public Product addProduct(@RequestBody Product product) {
        return productDb.addProduct(product);
    }


}

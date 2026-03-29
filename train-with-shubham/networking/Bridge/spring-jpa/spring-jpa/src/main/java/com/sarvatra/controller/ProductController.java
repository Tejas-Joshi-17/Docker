package com.sarvatra.controller;

import com.sarvatra.entities.Product;
import com.sarvatra.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/product")
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        final List<Product> allOrderByQuantityDesc = productRepository.findAll();
        return new ResponseEntity<>(allOrderByQuantityDesc, HttpStatus.OK);
    }


}

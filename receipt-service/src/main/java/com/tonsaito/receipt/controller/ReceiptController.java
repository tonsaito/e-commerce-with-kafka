package com.tonsaito.receipt.controller;

import com.tonsaito.receipt.model.ProductModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/receipt")
public class ReceiptController {

    @PostMapping
    public void generateReceipt(@RequestBody ProductModel product){
        System.out.println("Generating receipt for checkout [Product: "+product.getName()+" | Quantity: "+product.getQuantity()+"]");
    }
}

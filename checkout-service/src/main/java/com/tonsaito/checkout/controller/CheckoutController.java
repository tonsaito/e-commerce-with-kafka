package com.tonsaito.checkout.controller;

import com.tonsaito.checkout.entity.ProductEntity;
import com.tonsaito.checkout.model.MessageModel;
import com.tonsaito.checkout.repository.ProductRepository;
import com.tonsaito.checkout.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
public class CheckoutController {

    @Autowired
    private CheckoutService service;

    @PostMapping
    public ResponseEntity<MessageModel> checkout(@RequestBody ProductEntity entity){
        service.doCheckout(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(new MessageModel("Checkout criado com sucesso"));
    }

}

package com.tonsaito.checkout.service.impl;

import com.tonsaito.checkout.entity.ProductEntity;
import com.tonsaito.checkout.repository.ProductRepository;
import com.tonsaito.checkout.service.CheckoutService;
import com.tonsaito.checkout.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ReceiptService receiptService;


    @Override
    public ProductEntity doCheckout(ProductEntity entity) {
        ProductEntity savedProduct = repository.save(entity);
        receiptService.generateReceipt(savedProduct);
        return savedProduct;
    }
}

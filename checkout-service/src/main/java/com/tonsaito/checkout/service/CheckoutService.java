package com.tonsaito.checkout.service;

import com.tonsaito.checkout.entity.ProductEntity;
import org.springframework.stereotype.Component;

public interface CheckoutService {

    public ProductEntity doCheckout(ProductEntity entity);
}

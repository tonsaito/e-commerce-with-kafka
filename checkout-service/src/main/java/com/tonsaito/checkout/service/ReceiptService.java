package com.tonsaito.checkout.service;

import com.tonsaito.checkout.entity.ProductEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("receipt-service")
public interface ReceiptService {

    @PostMapping("/v1/receipt")
    public void generateReceipt(ProductEntity entity);

}

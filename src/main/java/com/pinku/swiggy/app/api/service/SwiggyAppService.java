package com.pinku.swiggy.app.api.service;

import com.pinku.swiggy.app.api.client.RestaurantServiceClient;
import com.pinku.swiggy.app.api.dto.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SwiggyAppService {

    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    public String greeting() {
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDTO checkOrderStatus(String orderId) {
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
}
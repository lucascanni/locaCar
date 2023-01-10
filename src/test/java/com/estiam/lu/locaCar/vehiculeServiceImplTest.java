package com.estiam.lu.locaCar;

import com.estiam.lu.locaCar.service.vehiculeServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class vehiculeServiceImplTest {

    @Test
    void calculatePrice() {
        vehiculeServiceImpl vehiculeService = new vehiculeServiceImpl();
        assert(vehiculeService.calculatePrice( 3, 50) == 150);
        assert(vehiculeService.calculatePrice( 5, 50) == 250);
        assert(vehiculeService.calculatePrice( 7, 50) == 300);
        assert(vehiculeService.calculatePrice( 9, 50) == 400);
        assert(vehiculeService.calculatePrice( 14, 50) == 600);
        assert(vehiculeService.calculatePrice( 20, 50) == 900);
    }
}
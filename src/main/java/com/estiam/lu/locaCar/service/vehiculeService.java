package com.estiam.lu.locaCar.service;
import com.estiam.lu.locaCar.dto.vehiculeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface vehiculeService {
    List<vehiculeDto> getAllVehicule();
    public int calculatePrice(int days, int price);
}

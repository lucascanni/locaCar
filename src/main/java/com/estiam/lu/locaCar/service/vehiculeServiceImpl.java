package com.estiam.lu.locaCar.service;
import com.estiam.lu.locaCar.domaine.vehicule;
import com.estiam.lu.locaCar.dto.vehiculeDto;
import org.springframework.beans.factory.annotation.Autowired;
import com.estiam.lu.locaCar.repository.vehiculeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class vehiculeServiceImpl implements vehiculeService{
    @Autowired
    vehiculeRepository vehiculeRepository;

    @Override
    public List<vehiculeDto> getAllVehicule(){
        return mapToVehiculeDto(vehiculeRepository.findAll());
    }

    private List<vehiculeDto> mapToVehiculeDto(List<vehicule> all){
        List<vehiculeDto> vehiculeDtoList=new ArrayList<>();
        for (vehicule veh:all){
            vehiculeDto vehiculeDto = new vehiculeDto();
            vehiculeDto.setColor(veh.getColor());
            vehiculeDto.setMarque(veh.getMarque());
            vehiculeDtoList.add(vehiculeDto);
        }
        return vehiculeDtoList;
    }

    public int calculatePrice(int days, int price){
        int semaines;
        semaines = days/7;
        return (days * price)-(price * semaines);
    }
}

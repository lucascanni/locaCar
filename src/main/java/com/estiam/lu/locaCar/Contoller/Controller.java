package com.estiam.lu.locaCar.Contoller;
import com.estiam.lu.locaCar.dto.vehiculeDto;
import com.estiam.lu.locaCar.service.vehiculeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estiam.lu.locaCar.service.vehiculeService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    vehiculeService vehiculeService;
    @GetMapping("/all")
    @CrossOrigin(origins = "*")
    public List<vehiculeDto> getListVehicule(){
        System.out.println("Request for all vehicule");
        return vehiculeService.getAllVehicule();
    }
    @GetMapping("/")
    @CrossOrigin(origins = "*")
    vehiculeDto getVehicule(){
        vehiculeDto vehiculeDto = new vehiculeDto();
        vehiculeDto.setMarque("volvo");
        return vehiculeDto;
    }
}

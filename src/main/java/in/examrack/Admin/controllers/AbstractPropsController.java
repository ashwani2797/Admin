package in.examrack.Admin.controllers;


import in.examrack.Admin.AbstractProps.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbstractPropsController {

    @Autowired
    private CarService service;
    @GetMapping("/abs-name")
    public String callAbstractService(){
        return service.getCompanyName();
    }

    @GetMapping("/abs-gear")
    public Integer callGearService(){
        return service.getGears();
    }

}

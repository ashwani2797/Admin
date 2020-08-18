package in.examrack.Admin.controllers;

import in.examrack.Admin.lookup.AbstractSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LookupController {

    @Autowired
    private AbstractSchoolService schoolServices;
    @GetMapping("/lookup")
    public String sendNotification(){
        return schoolServices.appendMark("Ashu", 10);
    }

}


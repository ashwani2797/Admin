package in.examrack.Admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationContextController {
    @Autowired
    private ApplicationContext applicationContext;


    @RequestMapping("/beans")
    public String[] getConfigs(){
        return applicationContext.getBeanDefinitionNames();
    }
}

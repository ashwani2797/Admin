package in.examrack.Admin.controllers;

import in.examrack.Admin.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleHelloController {

    @Autowired
    private SampleService sampleService;

    @Autowired
    private SampleService sampleSer;

    @Autowired
    @Qualifier("newName")
    private SampleService rename;



    @RequestMapping("/hello")
    public String hello(){
        return  sampleService.supplyData();
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return  sampleSer.supplyData();
    }

    @RequestMapping("/hello3")
    public String hello3(){
        return  rename.supplyData();
    }






}

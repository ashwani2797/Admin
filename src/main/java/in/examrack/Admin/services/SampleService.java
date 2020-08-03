package in.examrack.Admin.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("newName")
public class SampleService {

    private String message;

    public SampleService(){
        message = "Default";
    }
    public SampleService(String message){
        this.message = message;
    }

    public String supplyData(){
        return message;
    }
}

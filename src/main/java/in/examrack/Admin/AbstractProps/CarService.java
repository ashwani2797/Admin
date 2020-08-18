package in.examrack.Admin.AbstractProps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private List<CarAbstractService> services;
    @Autowired
    @Qualifier("Creta")
    private CarAbstractService cretaService;

    public String getCompanyName() {
        StringBuilder builder = new StringBuilder();
        //services.forEach(service -> builder.append(service.carCompany()));
        if (cretaService.carGears() == 0)
            builder.append("Creta Automatic");
        else
            builder.append("Creta no found");
        return builder.toString();
    }

    public Integer getGears() {
        StringBuilder builder = new StringBuilder();
        services.forEach(service -> builder.append(service.generateCarNumber()));
        return Integer.valueOf(builder.toString());
    }

}

package in.examrack.Admin.AbstractProps;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NUmberGenerator {

    public String generateNumberForCar(){
        Random random = new Random();
        return String.valueOf(random.nextInt(100000));
    }
}

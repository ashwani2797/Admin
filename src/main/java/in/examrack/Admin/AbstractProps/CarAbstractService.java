package in.examrack.Admin.AbstractProps;


import org.springframework.beans.factory.annotation.Autowired;

public abstract class CarAbstractService {

    @Autowired
    private NUmberGenerator nUmberGenerator;

    public String generateCarNumber(){
        return nUmberGenerator.generateNumberForCar();
    }

    public String carCompany(){
        return "Hyndauyi";
    }

    public abstract Integer carGears();
}

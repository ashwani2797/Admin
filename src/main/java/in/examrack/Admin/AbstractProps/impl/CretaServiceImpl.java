package in.examrack.Admin.AbstractProps.impl;

import in.examrack.Admin.AbstractProps.CarAbstractService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Creta")
public class CretaServiceImpl extends CarAbstractService {
    @Override
    public Integer carGears() {
        return 0;
    }
}

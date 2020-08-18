package in.examrack.Admin.AbstractProps.impl;

import in.examrack.Admin.AbstractProps.CarAbstractService;
import in.examrack.Admin.lookup.GradeService;
import org.springframework.stereotype.Service;

@Service
public class VernaServiceImpl extends CarAbstractService {

    @Override
    public Integer carGears() {
        return 6;
    }
}

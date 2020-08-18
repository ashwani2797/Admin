package in.examrack.Admin.lookup;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService {
    public String calculateGrades(List<Integer> marks){
        Integer total = marks.stream().reduce(0, Integer::sum);
        return total < 50 ? "B" : "A";
    }
}

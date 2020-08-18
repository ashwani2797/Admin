package in.examrack.Admin.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class SchoolNotification {

    @Autowired
    private GradeService gradeService;
    private String name;
    private List<Integer> marks = new ArrayList<>();

    public SchoolNotification(String name) {
        this.name = name;
        System.out.format("New object created for School notification.");
    }

    public String getName() {
        return name;
    }

    public String addMarks(Integer mark) {
        marks.add(mark);
        return gradeService.calculateGrades(marks);
    }

}

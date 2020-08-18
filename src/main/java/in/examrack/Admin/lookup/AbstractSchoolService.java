package in.examrack.Admin.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public abstract class AbstractSchoolService {


    private Map<String, SchoolNotification> notes = new HashMap<>();

    public String appendMark(String name, Integer mark) {
        SchoolNotification notification
                = notes.computeIfAbsent(name, exists -> getNotification(name));
        return notification.addMarks(mark);
    }


    @Lookup
    public abstract SchoolNotification getNotification(String name);
}

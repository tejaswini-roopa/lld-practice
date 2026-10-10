package designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(String name, Student student){
        students.put(name, student);
    }

    public Student getStudent(String name){
        return students.get(name);
    }
}

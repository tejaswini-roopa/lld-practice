package prototype;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String batch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(Student other)
    {
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
        this.batch = other.batch;
    }
    public Student copy(){
        return new Student(this);
    }
}

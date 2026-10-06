package prototype;

public class Main {
    static void main() {
        StudentRegistry sr = new StudentRegistry();
        sr.addStudent(
                "nov21BatchStud",
                new Student("Nov 21 Beginner")
        );
        sr.addStudent(
                "aug22Inter",
                new Student("Aug 22 Inter")
        );

        Student ujjwal = sr.getStudent("nov21BatchStud").copy();
        ujjwal.setName("Ujjwal");

        System.out.println("Original: " + sr.getStudent("nov21BatchStud").getName());
        System.out.println("Copy: " + ujjwal.getName());
    }
}
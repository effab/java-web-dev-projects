public class StudentPractice {
    public static void main(String[] args){
        Student student;
        student = new Student();
        student.setName("Abby");
        student.setStudentId(12345);
        student.setNumberOfCredits(1);
        student.setGpa(4.0);

        System.out.println("Name: " + student.getName());
        System.out.println("Student Id: " + student.getStudentId());
        System.out.println("Number of Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: " + student.getGpa());
    }
}

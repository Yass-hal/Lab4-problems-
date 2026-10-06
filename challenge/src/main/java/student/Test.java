package student;

public class Test {
    public static void main(String[] args) {


        // Display computer science students
        Major compSci=Major.defaultMajor_Cs;
        Major math=new Major("14","Mathematics");
        Student s1 = new Student("SAFI", "Amal", "0600000000", "amal@email.com", "22885676");
        Student s2 = new Student("ALAMI", "Samir", "0611111111", "samir@email.com", "23585976", compSci);
        Student s3 = new Student("BENALI", "Omar", "0622222222", "omar@email.com", "11223344", math);
        compSci.displayStudents();
        math.displayStudents();

        System.out.println("");
        compSci.getOccupancyRate();
        System.out.println(compSci.getStudentListAsString());
        boolean isRemoved = compSci.removeStudent("22885676");
        System.out.println(isRemoved);
        System.out.println(compSci.getStudentCount());
        System.out.println(compSci.getStudentListAsString());
    }
}


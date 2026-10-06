package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    public static final Major defaultMajor_Cs=new Major("23", "Computer science");

    public Major(String code, String name) {
            this.id=nextId++;
            this.code=code;
            this.name=name;
            students=new Student[50];
            this.studentCount=0;
    }
    public Major(){
            this("Unknown","Unknown");
    }
     //Method to add a student
    public void addStudent(Student s) {
            if (studentCount<students.length){
                students[studentCount]=s;
                studentCount++;
            }
    }

     //Getters
    public int getId(){
        return this.id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "The major code is "+this.code+" and its name is "+this.name;
    }


    //Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in "+name+" major is:");
        for (int i=0;i<studentCount;i++){
            System.out.println((i+1)+". "+students[i].getCne()+" "+students[i].getFullNameFormated());
        }
    }
    public Student findStudentByCNE(String cne){
        for (int i=0;i<studentCount;i++){
            if (students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }
    public boolean removeStudent(String cne){
        Student studentToRemove=findStudentByCNE(cne);
        if (studentToRemove==null){
            return false;
        }
        for (int i=0;i<studentCount;i++)
        {
            if (students[i].getCne().equals(cne))
            {
                for (int j=i;j<studentCount-1;j++)
                {
                    students[j]=students[j+1];
                }
            students[studentCount-1]=null;
            studentCount--;
            return true;
            }
        }
        return false;
    }
    public void getOccupancyRate(){
        String ret=String.format("%s capacity: 50 students\nCurrent enrollment: %d students \nOccupancy rate = %.1f%%",
        this.name,
         studentCount,
         (double)(studentCount*100)/students.length);
        System.out.println(ret);
    }
    public StringBuilder getStudentListAsString(){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<studentCount;i++){
            sb.append(students[i].getCne());
            sb.append(" ");
            sb.append(students[i].getFullNameFormated());
            sb.append("\n");
        }
        return sb;
    }






}

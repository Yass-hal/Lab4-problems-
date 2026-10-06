package student;

public class Student extends Person {
    private String cne;
    private Major major;


    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom,prenom,telephone,email);
        this.cne=cne;
        this.major=major;
        this.major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {

        this(nom,prenom,telephone,email,cne,Major.defaultMajor_Cs);
    }

    // Getters

    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }
    // Setters


    public void setCne(String cne) {
        this.cne = cne;
    }
    public String getFullNameFormated(){
        return String.format("%s %s",
                firstName.toUpperCase(),
                secondName
                );
    }

}


package instructor;

import student.Person;

public class Instructor extends Person {
        private String employeeNumber;
        public Instructor(String firstName, String secondName, String telephone, String email,String employeeNumber){
            super(firstName, secondName, telephone, email);
            this.employeeNumber=employeeNumber;
        }
        public String cleanEmployeeNumber(){
            return employeeNumber.trim().replace(" ","");
        }
        public String summaryLine(){
            return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                    employeeNumber,
                    secondName,
                    firstName);
        }
        public String toCard(){
            StringBuilder res=new StringBuilder();
            res.append("Instructor \n");
            res.append("----------\n");
            res.append("Employee #: ").append(employeeNumber).append("\n");
            res.append("Name      : ").append(secondName).append(", ").append(firstName).append("\n");
            res.append("Email     : ").append(email).append("\n");
            res.append("Phone     : ").append(phone).append("\n");
            return res.toString();
        }
        public String displayName(){
            StringBuilder res=new StringBuilder();
            res.append(secondName);
            if (firstName!=null){
                res.append(firstName);
            }
            return res.toString();

        }






}

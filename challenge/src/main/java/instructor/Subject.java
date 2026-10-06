package instructor;

public class Subject {
        private int id;
        private String code;
        private String title;
        public String normalizedCode(){
            return code.trim().toUpperCase();
        }
        public String  properTitle(){
            String[] arr=title.split(" ");
            StringBuilder result=new StringBuilder();
            for (String s:arr){
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring((1)).toLowerCase());
                result.append(" ");
            }
            return result.toString().trim();
        }
        public boolean isIntroCourse(){
            return (title.toLowerCase().contains("intro")||code.startsWith("Intro-"));
        }
        public String syllabusLine(Instructor instructor){
            StringBuilder res=new StringBuilder();
            res.append(code);
            res.append(" - ");
            res.append(title);
            res.append(" (Instructor: ");
            res.append(instructor.getFirstName());
            res.append(" ");
            res.append(instructor.getSecondName());
            res.append(")");
            return res.toString();
        }

}

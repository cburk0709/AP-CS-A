import java.util.ArrayList;

public class Student {
    private String studentName;
    private String studentGrade;
    private ArrayList<Double> grades = new ArrayList<Double>();

    public Student(String newStudentName, String newStudentGrade){
        studentName = newStudentName;
        studentGrade = newStudentGrade;
    }
    public String toString(){
        return studentName + " is a " + studentGrade;
    }

    public boolean passingOrFailing(){
        double gradeSum = 0;
        for (int i = 0; i < grades.size(); i++){
            gradeSum += grades.get(i);
        }
        double gradeAverage = gradeSum/grades.size();
        if (gradeAverage < 65){
            return false;
        } else {
            return true;
        }
    }

    public void addGrade(double grade){
        grades.add(grade);
    }

    //Setter and getter for name field
    public void setStudentName(String newStudentName){
        studentName = newStudentName;
    }
    public String getStudentName(){
        return studentName;
    }

    //Setter and getter for grade field
    public void setStudentGrade(String newStudentGrade){
        studentGrade = newStudentGrade;
    }
    public String getStudentGrade(){
        return studentGrade;
    }
}

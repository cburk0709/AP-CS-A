import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is the student's name: ");
        String studentName = userInput.next();
        System.out.print("What grade are they in: ");
        String studentGrade = userInput.next();
        System.out.print("How many classes are they taking: ");
        Student myStudent = new Student(studentName, studentGrade);
        int numberOfClasses = userInput.nextInt();
        for (int i = 1; i <= numberOfClasses; i++){
            System.out.print("What is students grade in class #" + i + ": ");
            myStudent.addGrade(userInput.nextDouble());
        }
        System.out.println(myStudent);
        if (myStudent.passingOrFailing() == true){
            System.out.println("On average, " + myStudent.getStudentName() + " is passing their classes.");
        } else {
            System.out.println("On average, " + myStudent.getStudentName() + " is failing their classes.");
        }
    }
}

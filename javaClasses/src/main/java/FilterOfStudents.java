import java.util.Arrays;
import java.util.Scanner;

public class FilterOfStudents {
//    private Student[] students;

        Scanner in = new Scanner(System.in);

    public void getListOfStudentsByFaculty(Student[] students) {
        System.out.println("Choose code of faculty: \nCode 1 Mathematical faculty \nCode 2 Physical faculty \nCode 3 Chemical faculty");
        int codeOfFaculty = in.nextInt();
        for (int i = 0; i < students.length; i++) {
            switch (codeOfFaculty) {
                case (1):
                    if (students[i].getFaculty() == "Mathematical")
                        System.out.println(students[i]);
                    break;
                case (2):
                    if (students[i].getFaculty() == "Physical")
                        System.out.println(students[i]);
                    break;
                case (3):
                    if (students[i].getFaculty() == "Chemical")
                        System.out.println(students[i]);
                    break;
            }
        }
    }

    public void getListsOfStudentsByFacultyAndCourses(Student[] students) {
        System.out.println("Choose code of faculty: \nCode 1 Mathematical faculty \nCode 2 Physical faculty \nCode 3 Chemical faculty");
        int codeOfFaculty = in.nextInt();
        System.out.println("Choose course (from 1 to 5):");
        int course = in.nextInt();
        for (int i = 0; i < students.length; i++) {
            switch (codeOfFaculty) {
                case (1):
                    if (students[i].getFaculty() == "Mathematical" && course == students[i].getCourse())
                        System.out.println(students[i]);
                    break;
                case (2):
                    if (students[i].getFaculty() == "Physical" && course == students[i].getCourse())
                        System.out.println(students[i]);
                    break;
                case (3):
                    if (students[i].getFaculty() == "Chemical" && course == students[i].getCourse())
                        System.out.println(students[i]);
                    break;
            }
        }
    }

    public void getListOfStudentsByGroup(Student[] students){
        System.out.println("Enter number of group:");
        String numberOfGroup = in.next();
        Arrays.stream(students).filter(student -> numberOfGroup.equals(student.getGroup())).forEach(System.out::println);
    }


    public void getListOfStudentsByAge(Student[] students) {
        System.out.println("Enter year of students birthday:");
        int yearOfBirthday = in.nextInt();
        Arrays.stream(students).filter(student -> yearOfBirthday <= Integer.parseInt(student.getBirthDate().subSequence(6, 10).toString())).forEach(System.out::println);

    }
}



import java.util.Scanner;

public class Main {

       public static Student[] createStudents() {
        Student[] student = new Student[16];
        student[0] = new Student(1101, "Ivanov", "Ivan", "Ivanovich","01.01.2000",
                    "Lenina 1", 291111111, "Mathematical", 1, "111");

        student[1] = new Student(1102, "Petrov", "Petr", "Ivanovich","03.05.1999",
                    "Lenina 2", 292222222, "Mathematical", 1, "111");

        student[2] = new Student(1103, "Sobolev", "Petr", "Ivanovich","03.08.2000",
                    "Lenina 3", 293333333, "Mathematical", 1, "112");

        student[3] = new Student(1104, "Mihalcov", "Mihail", "Petrovich","05.07.1999",
                    "Lenina 2", 294444444, "Mathematical", 1, "112");

        student[4] = new Student(1105, "Lisichkin", "Petr", "Mihailovich",  "01.01.1998",
                    "Lenina 2", 295555555, "Physical", 2, "221");

        student[5] = new Student(1106, "Lisichkin", "Mihail", "Petrovich",  "01.01.1998",
                    "Lenina 2", 296666666, "Physical", 2, "221");

        student[6] = new Student(1107, "Petrov", "Ivan",    "Mihailovich",   "01.01.1999",
                    "Lenina 2", 297777777, "Physical", 2, "222");

        student[7] = new Student(1108, "Samoilov", "Ivan",    "Mihailovich",   "01.01.1998",
                    "Lenina 2", 298888888, "Physical", 2, "222");

        student[8] = new Student(1109, "Simonov", "Ivan",    "Mihailovich",   "01.01.1997",
                    "Lenina 2", 299999999, "Chemical", 3, "331");

        student[9] = new Student(1110, "Goncharov", "Ivan",    "Mihailovich",   "01.01.1997",
                    "Lenina 2", 291010101, "Chemical", 3, "331");

        student[10] = new Student(1111, "Telionov", "Ivan",    "Mihailovich",   "01.01.1997",
                    "Lenina 15", 290111111, "Chemical", 3, "332");

        student[11] = new Student(1112, "Petrov", "Ivan",    "Mihailovich",   "01.01.1997",
                    "Lenina 2", 291212121, "Chemical", 3, "332");

        student[12] = new Student(1113, "Sidorov", "Ivan",    "Mihailovich",   "01.01.2000",
                    "Lenina 8", 291313131, "Physical", 1, "211");

        student[13] = new Student(1114, "Inanov", "Ivan",    "Mihailovich",   "01.01.1999",
                    "Lenina 2", 291414141, "Chemical", 1, "311");

        student[14] = new Student(1115, "Sobol", "Ivan",    "Mihailovich",   "01.01.1998",
                    "Lenina 25", 291515151, "Mathematical", 2, "121");

        student[15] = new Student(1116, "Petrov", "Ivan",    "Mihailovich",   "01.01.1996",
                    "Lenina 2", 291616161, "Mathematical", 5, "151");
        return student;
    }

    public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           Student [] listOfAllStudents =  createStudents();
        System.out.println("Choose list of student: \n 1 - List of students by faculty; \n 2 - List of students by faculty and course;" +
                "\n 3 - List of students by age; \n 4 - List of students by groupe;  ");
        int list = in.nextInt();
        switch (list){
            case (1) : new FilterOfStudents().getListOfStudentsByFaculty(listOfAllStudents); break;
            case (2) : new FilterOfStudents().getListsOfStudentsByFacultyAndCourses(listOfAllStudents); break;
            case (3) : new FilterOfStudents().getListOfStudentsByAge(listOfAllStudents); break;
            case (4) : new FilterOfStudents().getListOfStudentsByGroup(listOfAllStudents); break;
        }




    }
}



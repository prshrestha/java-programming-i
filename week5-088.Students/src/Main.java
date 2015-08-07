
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String studentName = "";
        String studentNumber = "";
        String searchTerm = "";

        while (true) {
            System.out.println("name:");
            studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }

            System.out.println("studentnumber:");
            studentNumber = reader.nextLine();

            list.add(new Student(studentName, studentNumber));
        }

        for (Student students : list) {
            System.out.println(students);
        }

        System.out.println("");
        System.out.println("Give search term: ");
        searchTerm = reader.nextLine();
        System.out.println("");
        System.out.println("Result: ");

        int i = 0;
        while (i < list.size()) {
            Student nameToSearch = list.get(i); //get the student object
            String strNameToSearch = nameToSearch.getName(); //gets the student name from the student object
            if (strNameToSearch.contains(searchTerm)) {
                System.out.println(nameToSearch);
            }
            i++;
        }
    }
}

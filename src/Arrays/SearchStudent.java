package Arrays;

import java.util.Scanner;

public class SearchStudent {
    public static void main(String[] args) {
        String[] nameStudents = {"Vu", "Loc", "Hop", "Van"};

        String nameYouFind;
        Scanner write = new Scanner(System.in);
        System.out.println("Enter name of student: ");
        nameYouFind = write.nextLine();

        boolean isExist = false;

        for(String name : nameStudents) {
            if (name.equals(nameYouFind)) {

                isExist = true;
                System.out.println("This name is in the list and is in the position: " + name);
            }
        }
        if(!isExist){
            System.out.println("No of student " + nameYouFind + " is found");
        }
    }
}

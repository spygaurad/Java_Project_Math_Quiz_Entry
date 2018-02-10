import java.io.IOException;
import java.util.Scanner;

import static javafx.application.Platform.exit;

/**
 * Created by Suraj on 9/18/2017.
 */
public class ID30330186 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of questions: ");
        int number_of_questions = scan.nextInt();
        //System.out.println(number_of_questions);
        if (number_of_questions <= 1) {
            System.out.println("Number of questions must be greater that one. Please reenter value: ");
            number_of_questions = scan.nextInt();
        }
        String name = null;
        int max_entrants;
        int max_school_entrants;
        Contest contest = new Contest(name, max_entrants = 8, max_school_entrants = 2, number_of_questions);


        //Creating school objects
        School school1 = new School("University of Sunshine Coast", "1");
        School school2 = new School("Australian catholic university", "2");
        School school3 = new School("University of technology Sydney", "3");
        School school4 = new School("Charles Darwin University", "4");
        School school5 = new School("Suraj Oli", "5");


        //Creating Student Objects
        Student student1 = new Student("Suraj", school1);
        Student student11 = new Student("Suraj", school1);
        Student student2 = new Student("Suraj", school1);
        Student student9 = new Student("Shaw", school1);
        Student student3 = new Student("Shreyansh", school2);
        Student student4 = new Student("Sabin", school2);
        Student student5 = new Student("Tyler", school3);
        Student student6 = new Student("Haiden", school3);
        Student student7 = new Student("Amy", school4);
        Student student8 = new Student("Lucifer", school4);
        Student student10 = new Student("Iris", school5);


        //Setting Entry
        Entry entry1 = new Entry(student1, number_of_questions);
        contest.setEntry(entry1);
        Entry entry11 = new Entry(student11, number_of_questions);
        contest.setEntry(entry11);
        Entry entry2 = new Entry(student2, number_of_questions);
        contest.setEntry(entry2);
        Entry entry9 = new Entry(student9, number_of_questions);
        contest.setEntry(entry9);
        Entry entry3 = new Entry(student3, number_of_questions);
        contest.setEntry(entry3);
        Entry entry4 = new Entry(student4, number_of_questions);
        contest.setEntry(entry4);
        Entry entry5 = new Entry(student5, number_of_questions);
        contest.setEntry(entry5);
        Entry entry6 = new Entry(student6, number_of_questions);
        contest.setEntry(entry6);
        Entry entry7 = new Entry(student7, number_of_questions);
        contest.setEntry(entry7);
        Entry entry8 = new Entry(student8, number_of_questions);
        contest.setEntry(entry8);
        Entry entry10 = new Entry(student10, number_of_questions);
        contest.setEntry(entry10);
        System.out.println("Initialization Complete ");


        //calling menu
        menu(contest);


    }


    public static void menu(Contest contest) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Maths Whiz Championship Competition");
        System.out.println("-----------------------------------");
        System.out.println("Please Select An Option Below: ");
        System.out.println("1.Enter Result ");
        System.out.println("2. Display Result ");
        System.out.println("3. View Program Credits ");
        System.out.println("4. Exit Program ");
        System.out.println();
        System.out.println();
        System.out.println();
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                contest.enterScores();
                System.in.read();
                menu(contest);
            case 2:
                contest.viewContestScores();
                System.in.read();
                menu(contest);
            case 3:
                viewProgramCredits(contest);
                System.in.read();
                menu(contest);
            case 4:
                System.out.println("Thank You For Using Quiz Whiz!! Hope It Was Useful To You");
                exit();
            /*default:
                System.out.println("Please Enter Correct Option");
                menu(contest);*/

        }

    }


    public static void viewProgramCredits(Contest contest) throws IOException {
        System.out.println("******************************************************");
        System.out.println("Program Credits: ");
        System.out.println("        Suraj Oli, stydent ID 30330186 ");
        System.out.println("for ITECH1000 Programming 1 Semester 2 2017");
        System.out.println("******************************************************");
        System.out.println("Press any key to Return To Menu");

    }


}


import java.util.Scanner;

/**
 * Created by Suraj on 9/18/2017.
 */
public class Contest extends Entry {
    private String name;
    private int max_entrants;
    private int number_of_questions;
    private int max_school_entrants;
    private  Entry[] entry;
    static int count = 0;
    int flag ;

    public Contest(String name, int max_entrants,int max_school_entrants,int number_of_questions)
    {
        this.name=name;
        this.max_entrants=max_entrants;
        this.number_of_questions=number_of_questions;
        this.max_school_entrants=max_school_entrants;

        entry = new Entry[max_entrants];

    }
    public void setEntry(Entry e) {
        if (entry[0] != null) {
            if (!capacityReached()) {
                if (!schoolLimitReached(e.getEntrant().getSchool())) {
                    registerEntrant(e.getEntrant());
                    if (flag == 1) {
                        System.out.println("Unable to Register. Name Duplication ");
                    } else {
                        entry[count] = e;
                        count++;
                        System.out.println("Succesfully Registered " +e.getEntrant().getName()+" representing "+e.getEntrant().getSchool().getName());
                    }

                }else
                {
                    System.out.println("Unable To register. School Limit Reached for "+e.getEntrant().getSchool().getName());
                }
            }else
            {
                System.out.println("Unable To Register Amymomre.Maximum Entrancts Limit Reached");
            }

        }else
        {
            entry[count] = e;
            count++;
            System.out.println("Succesfully Registered " +e.getEntrant().getName()+" representing "+e.getEntrant().getSchool().getName());


            //System.out.println(entry[0].getSchool().getName());
        }


    }

    public String getContestName() {
        return name;
    }

    public int getEntrantLimit() {
        return max_entrants;
    }

    public int getNumber_of_questions() {
        return number_of_questions;
    }

    public void registerEntrant(Student entrant)
    {
        flag=0;
        for(int i=0 ;i<max_entrants;i++) {
            if (entry[i] != null) {
                if(entry[i].getEntrant().getName().equalsIgnoreCase(entrant.getName())){
                    flag = 1;
                }

            }
        }

        /*for (Entry e: entry) {
            if(e.getName().equalsIgnoreCase(entrant.getName())){
                flag = 1;
            }
        }*/

    }

    public  boolean capacityReached()
    {
        if(count >= getEntrantLimit())
        {
            return true;
        }
        return false;
    }

    public boolean schoolLimitReached(School school){
        int sameSchoolNo=0;
        for(int i=0 ;i<max_entrants;i++) {
            if (entry[i] != null) {
                if (entry[i].getEntrant().getSchool().getName().equalsIgnoreCase(school.getName())) {
                    sameSchoolNo++;
                }

            }
        }


        /*for (Entry e:entry)

         {
             System.out.println(entry[0].getEntrant().getSchool().getName());
            if (e.getEntrant().getSchool().getName().equalsIgnoreCase(school.getName())) {
                sameSchoolNo++;
            }
        }*/
            if(sameSchoolNo>=2)
            {
                return true;
            }
            return false;

    }

    public void enterScores() {

        for (int i = 0; i < number_of_questions; i++) {
            int k=i;
            System.out.println("Enter Marks For Question " + (++k));
            for (int j = 0; j < max_entrants; j++) {
                System.out.print("Enter marks for " + entry[j].getEntrant().getName()+" : ");
                Scanner s1 = new Scanner(System.in);
                int marks1 = s1.nextInt();
                entry[j].setScore(marks1, i);
            }
            System.out.println("Score Entry for Question"+ k + "Completed");
            System.out.println();
        }
        System.out.println("Score Entry Complete");
        System.out.println("Press enter to Return To Menu");
        System.out.println();
    }

    public void viewContestScores() {

        System.out.println("-----------------------------------");
        System.out.println("Maths Whiz Championship Competition Result");
        System.out.println("-----------------------------------");
        System.out.println();
        sortResults();
            for (int j = 0; j < max_entrants; j++) {

                System.out.println("Total Score For :" + entry[j].getEntrant().getName() + "   :" + entry[j].totalScore());

            }
        System.out.println();
        System.out.println("First     :"+entry[0].getEntrant().getName()+" from "+entry[0].getEntrant().getSchool().getName());
        System.out.println("Second    :"+entry[1].getEntrant().getName()+" from "+entry[1].getEntrant().getSchool().getName());
        System.out.println("Third     :"+entry[2].getEntrant().getName()+" from "+entry[2].getEntrant().getSchool().getName());
        System.out.println("Press enter to Return To Menu");
    }

    public void sortResults(){
        Entry temp;

        for(int i=0;i<max_entrants;i++) {

                for (int j = i + 1; j < max_entrants; ++j)
                {
                    if (entry[i].totalScore() < entry[j].totalScore())
                    {
                        temp =  entry[i];
                        entry[i] = entry[j];
                        entry[j] = temp;
                    }
                }

        }

    }


}

/**
 * Created by Suraj on 9/18/2017.
 */
public class Entry extends Student{
    private Student entrant;
    private int[] quizscores;

    public Entry(Student entrant,int noOfQuestion )
    {
        this.entrant = entrant;
        quizscores = new int[noOfQuestion];

    }
    public void setScore(int value,int index){
        quizscores[index]=value;
    }

    public Entry() {
    }

    public int getScore(int questionNo){
        return quizscores[questionNo];
    }

    public Student getEntrant(){
        return entrant;
    }


    public int totalScore(){
        int total =0;
        for (int i = 0; i< quizscores.length; i++) {
            total=total+quizscores[i];
        }
        return total;
    }

}


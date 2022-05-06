import java.util.*;

public class ClassLog implements Comparable <ClassLog>{
    String dialledNumber;
    int duration;
    String dialedDate;

    public ClassLog(String dialledNumber, int duration, String dialedDate){
        this.dialedDate = dialedDate;
        this.duration = duration;
        this.dialledNumber = dialledNumber;
    }

    @Override
    public int compareTo(ClassLog c){
        return Integer.compare(this.duration, c.duration);
    }
    public void printResult(){
        System.out.println("Dialled number: " + dialledNumber + "Duration: " + duration + "Date: " + dialedDate);
    }

}
class CallLogDemo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        s.nextLine();
        ArrayList<ClassLog> callList = new ArrayList<>();
        while (input --> 0){
            String num = s.nextLine();
            int dur = Integer.parseInt(s.nextLine());
            String date = s.nextLine();
            ClassLog cl = new ClassLog(num, dur, date);
            callList.add(cl);

        }
        Collections.sort(callList);
        for(ClassLog c : callList){

            System.out.println("Dialled number: " + c.dialledNumber + "Duration: " + c.duration + "Date: " +c. dialedDate);
        }


    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        var studentName =  new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while(!userResponse.equals("done")){
            System.out.println("Enter next name or 'done' tp end:");
            userResponse = reader.nextLine();
            if (userResponse.equals("done")){
                studentName.add(userResponse);
            }
        }
        System.out.println("The students in your class are: ");
        for (var Name: studentName){
            System.out.println(Name);
        }
    }
}

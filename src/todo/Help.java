package todo;

import java.util.ArrayList;
import java.util.List;

public class Help {

    public static void allArguments(){
        System.out.println("$ todo\n" +
                "\n" +
                "Command Line todo.Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                "    -l   Lists all the tasks\n" +
                "    -a   Adds a new task\n" +
                "    -r   Removes an task\n" +
                "    -c   Completes an task");
    }

    public static void noTask(){
        System.out.println("Unable to add: no task provided.");
    }
    public static void wrongNumber(String wrongNum){
        List<Character> notNumber = new ArrayList<>();
        for (char ch : wrongNum.toCharArray()) {
            notNumber.add(ch);
        }
        if (notNumber.get(0)>57 && notNumber.get(0)<48) {
            System.out.println("I's not a number.");
        }
        else{
            System.out.println("The list does not contain that many items.");
        }
    }
}

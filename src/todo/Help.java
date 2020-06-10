package todo;

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
}

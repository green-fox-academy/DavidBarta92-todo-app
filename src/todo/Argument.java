package todo;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Argument {
    public static void list() {
        try {
            if (TasksFile.getLines().size() > 0){
                for (int i = 0; i< TasksFile.getLines().size(); i++){
                    System.out.println((i+1) + " - " + TasksFile.getLines().get(i));
                }
            }
            else {
                System.out.println("No todos for today! :)");
            }
        } catch (Exception e){
            System.out.print("Unable to read file: todo-data.txt");
        }
    }

    public static void add(String newTask){
        try {
            List<String> content = new ArrayList<>();
            for (int i = 0; i < TasksFile.getLines().size(); i++) {
                content.add(TasksFile.getLines().get(i));
            }
            content.add("[ ] " + newTask);
            Files.write(Objects.requireNonNull(TasksFile.getPath()), content);
        } catch (Exception e){
            Help.noTask();
        }
    }

    public static void remove(String number) {
        try {
            int num = (Integer.parseInt(number))-1;
            List<String> content = new ArrayList<>();
            int i = 0;
            while (i < TasksFile.getLines().size()) {
                if (i != num){
                    content.add(TasksFile.getLines().get(i));
                }
                i++;
            }
            Files.write(Objects.requireNonNull(TasksFile.getPath()), content);
        } catch (Exception e){
            Help.wrongNumber(number);
        }
    }

    public static void check(String number){
        try {
            int num = (Integer.parseInt(number))-1;
            List<String> content = new ArrayList<>();
            int i = 0;
            while (i < TasksFile.getLines().size()) {
                if (i == num){
                    Task task = new Task(i);
                    task.setToChecked();
                    content.add(task.convertToLine());
                }
                else{
                    content.add(TasksFile.getLines().get(i));
                }
                i++;
            }
            Files.write(Objects.requireNonNull(TasksFile.getPath()), content);
        } catch (Exception e){
            Help.wrongNumber(number);
        }
    }
}

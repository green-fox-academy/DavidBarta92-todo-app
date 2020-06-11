package todo;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Argument {
    public static void list() throws IOException {
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

    public static void add(String newTask) throws IOException {
        try {
            List<String> content = new ArrayList<String>();
            for (int i = 0; i < TasksFile.getLines().size(); i++) {
                content.add((String) TasksFile.getLines().get(i));
            }
            content.add("[ ] " + newTask);
            Files.write(TasksFile.getPath(), content);
        } catch (Exception e){
            Help.noTask();
        }
    }

    public static void remove(String number) throws IOException{
        try {
            int num = (Integer.parseInt(number))-1;
            List<String> content = new ArrayList<String>();
            int i = 0;
            while (i < TasksFile.getLines().size()) {
                if (i != num){
                    content.add((String) TasksFile.getLines().get(i));
                }
                i++;
            }
            Files.write(TasksFile.getPath(), content);
        } catch (Exception e){
            Help.wrongNumber(number);
        }
    }

    public static void check(String number) throws IOException{
        try {
            int num = (Integer.parseInt(number));
            List<String> content = new ArrayList<String>();
            int i = 0;
            while (i < TasksFile.getLines().size()) {
                if (i == num){
                    Task task = new Task(i);
                    task.setToChecked();
                    content.add(task.convertToLine());
                    System.out.println(task.convertToLine()); //---------------------------------
                }
                i++;
            }
        } catch (Exception e){
            Help.wrongNumber(number);
        }
    }
}

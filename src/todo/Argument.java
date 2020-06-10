package todo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Argument {
    public static List getTasks() throws IOException {
        Path filePath = Paths.get("todo-data.txt");
        List<String> lines = Files.readAllLines(filePath);
        return lines;
    }

    public static void list() throws IOException {
        try {
            Argument.getTasks();
            if (Argument.getTasks().size() > 0){
                for (int i = 0; i< Argument.getTasks().size(); i++){
                    System.out.println((i+1) + " - " + Argument.getTasks().get(i));
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
        if (newTask.equals("")){
            Help.noTask();
        }
        else{
            Argument.getTasks();
            List<String> content = new ArrayList();
            for (int i = 0; i < Argument.getTasks().size(); i++){
                content.add((String) Argument.getTasks().get(i));
            }
            content.add(newTask);
            Path filePath = Paths.get("todo-data.txt");
            Files.write(filePath, content);
        }
    }
}

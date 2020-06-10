package todo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Argument {
    public static void list() throws IOException {
        try {
            Path filePath = Paths.get("todo-data.txt");
            List<String> lines = Files.readAllLines(filePath);
            if (lines.size() > 0){
                for (int i = 0; i< lines.size(); i++){
                    System.out.println((i+1) + " - " + lines.get(i));
                }
            }
            else {
                System.out.println("No todos for today! :)");
            }
        } catch (Exception e){
            System.out.print("Unable to read file: todo-data.txt");
        }

    }
}

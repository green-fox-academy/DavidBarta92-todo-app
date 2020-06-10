package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TasksFile {
    private static Path filePath;
    private static List<String> lines;

    public static Path getPath(){
        try{
            return filePath = Paths.get("C:\\Users\\MY\\Documents\\greenfox\\DavidBarta92-todo-app\\todo-data.txt");
        } catch (Exception e){
            Help.noTask();
            return null;
        }
    }

    public static List<String> getTasks() throws IOException {
            lines = Files.readAllLines(TasksFile.getPath());
            return lines;
    }
}

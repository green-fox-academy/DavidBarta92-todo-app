package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TasksFile {
    private static final Path filePath = Paths.get("C:\\Users\\MY\\Documents\\greenfox\\DavidBarta92-todo-app\\todo-data.txt");
    private static List<String> lines;
    private static String line;

    public static Path getPath(){
        try{
            return filePath;
        } catch (Exception e){
            Help.noTask();
            return null;
        }
    }

    public static List<String> getLines() throws IOException {
            lines = Files.readAllLines(TasksFile.getPath());
            return lines;
    }

    public static String getOneLine(int index){
        try {
            lines = Files.readAllLines(TasksFile.getPath());
            for (int i = 0; i <= index ; i++){
                line = lines.get(i);
            }
            return line;
        } catch (IOException e) {
            return null;
        }
    }
}

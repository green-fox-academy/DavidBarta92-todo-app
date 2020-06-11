package todo;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private  String name;
    private boolean checked;

    public Task(int indexOfLine){
        String line = TasksFile.getOneLine(indexOfLine);
        List<Character> lineInChar = new ArrayList<>();
        for (char ch : line.toCharArray()) {
            lineInChar.add(ch);
        }
        if(lineInChar.get(1).equals("X")){
            this.checked = true;
        }
        else {
            this.checked = false;
        }
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 4; i < lineInChar.size(); i++){
            nameBuilder.append(lineInChar.get(i));
        }
        this.name = nameBuilder.toString();
    }

    public boolean isChecked(){
        return this.checked;
    }

    public void setToChecked(){
        this.checked = true;
    }

    public String convertToLine(){
        StringBuilder lineBuilder = new StringBuilder();
        if (this.checked){
            lineBuilder.append("[X] " + name);
            String filanLine = lineBuilder.toString();
            return filanLine;
        }
        else {
            lineBuilder.append("[ ] " + name);
            String filanLine = lineBuilder.toString();
            return filanLine;
        }
    }
}

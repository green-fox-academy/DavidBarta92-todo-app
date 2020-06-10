package todo;

import java.io.IOException;

public class Todo {
    public static void main(String[] args) throws IOException {
        try {
            if (args.length == 0) Help.allArguments();
            else if (args[0].equals("-l")) Argument.list();
            else if (args[0].equals("-a")) Argument.add(args[1]);
            else if (args[0].equals("-r")) Argument.remove(args[1]);
            else if (args[0].equals("-c")) Argument.check(args[1]);
        }catch (Exception e){
            Help.unsupportedArg();
        }
    }
}

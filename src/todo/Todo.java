package todo;

import com.sun.org.apache.xpath.internal.Arg;

import java.io.IOException;

public class Todo {
    public static void main(String[] args) throws IOException {
            if (args.length == 0) Help.allArguments();
            else if (args[0].equals("-l")) Argument.list();
            else if (args[0].equals("-a")) Argument.list();
    }
}

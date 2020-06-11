package todo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.applet.Main;

import static org.junit.Assert.*;

public class TodoTest {
    @Test
    public void getOneLine() {
        assertEquals("[ ] Buy milk", TasksFile.getOneLine(1));
    }
}
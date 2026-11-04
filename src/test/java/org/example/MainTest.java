package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testTemp(){
        assertEquals(4, Main.addition(2,2));
    }

}

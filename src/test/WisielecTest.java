package src.test;

import org.junit.Test;
import src.main.Wisielec;
import static org.junit.Assert.assertTrue;

public class WisielecTest {
    @Test
    public void pelnyWisielec0Zyc() {
        Wisielec wisielec = new Wisielec();
        String result = wisielec.writeHangedMan(0);
        assertTrue(result.contains("O"));
        assertTrue(result.contains("/|\\"));  // to zadziała bo /|\\ jest w środku /|\\  |
        assertTrue(result.contains("/ \\"));  // tak samo
    }
}

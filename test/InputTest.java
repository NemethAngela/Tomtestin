import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test
    public void testCheckInputAlpha() {
        boolean actual = this.mainFrame.checkInput("a");
        assertFalse(actual);        //az importálásnál fontosak, hogy a jupitereset válasszuk
    }

    @Test
    public void testCheckInputNum() {
        boolean actual = this.mainFrame.checkInput("12.3");
        assertTrue(actual);
    }
}

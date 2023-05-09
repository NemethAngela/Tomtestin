import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainFrameTest {
    MainFrame mainFrame;


    @BeforeEach     //jupiterest választjuk a felkínáltakból
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test   //jupiteres kell
    public void testCalcBodyIndex() {
        double actual = this.mainFrame.calcBodyIndex(100, 1,8);
        double expected = 30.8;
        assertEquals(expected, actual, 0.02);
    }

}
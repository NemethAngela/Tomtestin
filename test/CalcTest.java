import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
    MainFrame mainFrame;


    @BeforeEach     //jupiterest választjuk a felkínáltakból
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test   
    public void testCalcBodyIndex() {
        double actual = this.mainFrame.calcBodyIndex(100, 1.8);
        double expected = 44.5;
        assertEquals(expected, actual);
    }

    @Test   //jupiteres kell
    public void testCalcBodyIndexBottom() {     //alsó értéket vizsgáljuk Bottom
        double actual = this.mainFrame.calcBodyIndex(100, 1.8);
        double expected = 0.34;
        assertEquals(expected, actual, 0.01);
    }

    @Test   //még egy teszt
    public void testCalcBodyIndexTop() {
        double actual = this.mainFrame.calcBodyIndex(600, 2.5);
        double expected = 96.0;
        assertEquals(expected, actual, 0.01);
    }

}
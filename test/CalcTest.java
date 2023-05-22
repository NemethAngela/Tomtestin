import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
    MainFrame mainFrame;


    @BeforeEach     //jupiterest választjuk a felkínáltakból
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test   //jupiterest választjuk a felkínáltakból
    public void testCalcBodyIndex() {
        double actual = this.mainFrame.calcBodyIndex(100, 180);
        double expected = 30.86;
        assertEquals(expected, actual, 0.01);
    }

    @Test  
    public void testCalcBodyIndexBottom() {     //alsó értéket vizsgáljuk Bottom
        double actual = this.mainFrame.calcBodyIndex(100, 180);
        double expected = 30.86;
        assertEquals(expected, actual, 0.01);
    }

    @Test   //még egy teszt
    public void testCalcBodyIndexTop() {
        double actual = this.mainFrame.calcBodyIndex(600, 250);
        double expected = 96.0;
        assertEquals(expected, actual, 0.01);
    }

}
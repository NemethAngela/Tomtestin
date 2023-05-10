import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    InputPanel tomegPanel;
    InputPanel magassagPanel;
    InputPanel indexPanel;
    JPanel buttonPanel;
        
    public MainFrame() {
        this.setFrame();    //nem itt állítjuk  be az ablakot, a konstruktor nem erre való, itt csak meghívjuk
        this.initComponent();
        this.addComponent();
    }

    private void initComponent() {
        this.tomegPanel = new InputPanel("Tömeg");
        this.magassagPanel = new InputPanel("Magassag");
        this.buttonPanel = new JPanel();
        this.indexPanel = new InputPanel("Testtömeg index");
    }

    private void addComponent() {
        this.add(this.tomegPanel);
        this.add(this.magassagPanel);
        this.add(this.buttonPanel);     //nem mindegy a sorrend
        this.add(this.indexPanel);
    }

    private void setFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //enélkül nem lép ki 
        //this.setSize(300, 200);
        this.pack();    // így felveszi a komponens nevét, nem kell méretezgetni
        this.setVisible(true);
    }
}

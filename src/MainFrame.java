import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    InputPanel tomegPanel;
    InputPanel magassagPanel;
    InputPanel indexPanel;
    JPanel buttonPanel;
    JButton calcButton;
        
    public MainFrame() {    //konstruktorban hívunk
        this.setFrame();    //nem itt állítjuk  be az ablakot, a konstruktor nem erre való, itt csak meghívjuk
        this.initComponent();
        this.addComponent();
        this.handleEvent();
        this.startCalc();
        
    }

    private void initComponent() {
        this.tomegPanel = new InputPanel("Tömeg (kg)");
        this.magassagPanel = new InputPanel("Magassag");
        this.buttonPanel = new JPanel();
        this.indexPanel = new InputPanel("Testtömeg index");
        this.calcButton = new JButton("Számít");
    }

    private void addComponent() {
        this.add(this.tomegPanel);
        this.add(this.magassagPanel);
        this.add(this.buttonPanel);     //nem mindegy a sorrend
        this.add(this.indexPanel);
        this.buttonPanel.add(this.calcButton);
    }

    private void handleEvent() {    //eseménykezelő
        this.calcButton.addActionListener(e  -> {   //javascript-ben = kell, itt javaban -

        });    
    }

    private void startCalc() {
        String tomegStr = this.tomegPanel.getValue();
        if(!this.checkInput(tomegStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double tomeg = Double.parseDouble(tomegStr);
        String magassagStr = this.magassagPanel.getValue();
        if(!this.checkInput(magassagStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double magassag = Double.parseDouble(magassagStr);
        Double testtomegIndex = this.calcBodyIndex(tomeg, magassag);    //direkt van nagy D-vel, így működik a toString
        this.indexPanel.setValue(testtomegIndex.toString());
    }

    public double calcBodyIndex(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    public boolean checkInput(String input) {
        boolean ok = false;
       if(input.matches("[0-9.]+")) {   //a + azt jelenti, hogy min. egynek kell lennie, el kell fogadni pontot is
        ok = true;
       }
       return ok;
    }

    private void setFrame() {
        this.setLayout (new BoxLayout(this.getContentPanel(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //enélkül nem lép ki 
        //this.setSize(300, 200);
        this.pack();    // így felveszi a komponens nevét, nem kell méretezgetni
        this.setVisible(true);
    }
}

package ui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel(){

        this.setLayout(new BorderLayout());

        this.add(new TopPanel(), BorderLayout.NORTH);
        this.add(new LeftPanel(), BorderLayout.WEST);

    }

}
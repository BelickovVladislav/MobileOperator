package frame;

import panel.OwnerPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vladislav on 17.02.2017.
 */
public class Home extends JFrame {
    private final JTabbedPane tabbedPane;
    public Home(){
        super("Mobile Operator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,500);

        setPreferredSize(new Dimension(500,500));

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab1",new OwnerPanel());
        this.add(tabbedPane);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new Home();
    }
}

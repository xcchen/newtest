package xtest.hello;

import javax.swing.*;
import java.awt.*;

/**
 * Created by chenxa on 11/14/2014.
 */
public class HW {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE  );

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add( label );

        frame.pack();
        frame.setVisible(true);
        frame.setSize( new Dimension(300, 100) );
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater( ()-> {
            createAndShowGUI();
            // createAndShowGUI();  // test
        });
     }

}


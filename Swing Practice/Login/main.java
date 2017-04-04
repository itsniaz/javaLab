import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * main
 */
public class main extends JFrame{

    public main () {
      
            setLayout(new BorderLayout());

            JPanel p1 = new JPanel(new BorderLayout());

            p1.add(new JButton("Page Start"),BorderLayout.PAGE_START);
            p1.add(new JButton("Page End"),BorderLayout.PAGE_END);
            p1.add(new JButton("Line Start"),BorderLayout.LINE_START);
            p1.add(new JButton("Line End"),BorderLayout.LINE_END);
            p1.add(new JButton("Center"),BorderLayout.CENTER);


            JPanel p2 = new JPanel(new BorderLayout());

             p1.add(new JButton("Page Start"),BorderLayout.EAST);
            p1.add(new JButton("Page End"),BorderLayout.WEST);
            p1.add(new JButton("Line Start"),BorderLayout.NORTH);
            p1.add(new JButton("Line End"),BorderLayout.SOUTH);
            p1.add(new JButton("Center"),BorderLayout.CENTER);


            JPanel p3 = new JPanel(new BorderLayout());

            p3.add(p1,BorderLayout.NORTH);
            p3.add(p2,BorderLayout.SOUTH);

            add(p3);
            
            

            //
            add(new JButton("East"),BorderLayout.CENTER);


            setSize(500,500);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
        }
    public static void main(String[] arfs) {
        new main ();
    }
}
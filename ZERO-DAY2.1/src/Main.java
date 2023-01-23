import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame courseReg = new JFrame("Course Registration Portal");
        JLabel label = new JLabel("Current Level");
        JButton button1 = new JButton("!00 Level");
        JButton button2 = new JButton("200 Level");
        JButton button3 = new JButton("300 Level");
        JButton button4 = new JButton("400 Level");


        courseReg.add(label);
        courseReg.add(button1);
        courseReg.add(button2);
        courseReg.add(button3);
        courseReg.add(button4);

        courseReg.setVisible(true);
        courseReg.setSize(500, 500);
        courseReg.setLayout(new GridLayout(5,1));
        courseReg.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        button3.addActionListener(e -> {
            if(e.getSource()==button3){
                Next next = new Next();
                next.courseReg();
            }
        });

    }
}
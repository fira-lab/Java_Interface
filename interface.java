import javax.swing.*;
import java.awt.*;

class TestFrame1 {
    public static void main(String[] args){
        JFrame f1 = new JFrame();
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setTitle("Login");

        JLabel l1 = new JLabel("User name");
        JLabel l2 = new JLabel("Password");

        JTextField t1 = new JTextField(20);
        JPasswordField t2 = new JPasswordField(20);

        JButton b1 = new JButton("Submit");
        JButton b2 = new JButton("Reset");

        JCheckBox o = new JCheckBox("tick");

        


        f1.setLayout(new FlowLayout());

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);
        f1.add(b2);
        f1.add(o);

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

import java.awt.*;

class TestFrame1 {
    public static void main(String[] args){
        Frame f1 = new Frame();
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setTitle("Login");

        

        Label l1 = new Label("User name");
        Label l2 = new Label ("password");

        TextField t1 = new TextField(20);
        TextField t2 = new TextField(20);

        Button b1 = new Button("submit");
        Button b2 = new Button("Reset");

        f1.setLayout(new FlowLayout());

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);
        f1.add(b2);
    }
}

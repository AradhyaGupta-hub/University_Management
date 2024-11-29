import javax.swing.*;
import java.awt.*;
public class Demo extends JFrame implements Runnable {
    Thread t;
    Demo() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        t = new Thread(this);
        t.start();

        setLocation(250, 50);
        setSize(1000, 700);
        setVisible(true);
    }
    public void run() {
        try {
            Thread.sleep(3000);
            setVisible(false);
            new Login();
        } catch (Exception e) {}
    }
    public static void main (String[] args){
        Demo d = new Demo();
    }
}


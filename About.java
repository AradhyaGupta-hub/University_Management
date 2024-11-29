import javax.swing.*;
import java.awt.*;
public class About extends JFrame{

    About(){

        setSize(700,500);
        setLocation(400,150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,300,200);
        add(image);

        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);

        JLabel name = new JLabel("Developed by Aradhya Gupta");
        name.setBounds(70,260,5500, 40);
        name.setFont(new Font("Tahoma",Font.BOLD,30));
        add(name);

        JLabel email = new JLabel("Email Id - aradhyaguptaabc@gmail.com");
        email.setBounds(70,300,5500, 40);
        email.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(email);

        JLabel phone = new JLabel("Phone number : 8619512558 ");
        phone.setBounds(70,340,5500, 40);
        phone.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(phone);

        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}

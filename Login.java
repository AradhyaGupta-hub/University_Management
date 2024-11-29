import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{

    JButton login,cancel;
    JTextField tfusername, tfpassword;

    Login(){
        setSize(600,300);
        setLocation(500,250);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel lblusername = new JLabel("Username");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(lblusername,gbc);

        tfusername = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(tfusername,gbc);

        JLabel lblpassword = new JLabel("Password");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(lblpassword,gbc);

        tfpassword = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(tfpassword,gbc);

        login = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(login,gbc);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Tahoma",Font.BOLD,16));
        login.addActionListener(this);

        cancel = new JButton("Cancel");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(cancel,gbc);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        getContentPane().setBackground(Color.white);
        cancel.addActionListener(this);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(image,gbc);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = tfusername.getText();
            String password = tfpassword.getText();

            String query = "select * from login where username ='"+username+"' and password ='"+password+"'";
            try {
                Con c = new Con();
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()){
                    setVisible(false);
                    new Project();
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                    setVisible(false);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }

        public static void main(String[] args) {
            new Login();
        }

}

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class FeesStructure extends JFrame{

    FeesStructure(){

        setSize(1000,700);
        setLocation(250,50);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel("Fees Structure");
        heading.setBounds(50,20,400,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);

        JTable table = new JTable();

        try {
            Con c = new Con();
            ResultSet rs = c.s.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,70,1000,700);
        add(jsp);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FeesStructure();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener{

    Project(){
        setSize(1540,830);
        setTitle("University Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();

//      Section for Information
        JMenu newInfo = new JMenu("New Information");
        newInfo.setFont(new Font("Tahoma",Font.BOLD,16));
        newInfo.setForeground(Color.CYAN);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

//       Section for Details
        JMenu details = new JMenu("View Details");
        details.setFont(new Font("Tahoma",Font.BOLD,16));
        details.setForeground(Color.BLUE);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

//        Section for Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setFont(new Font("Tahoma",Font.BOLD,16));
        leave.setForeground(Color.RED);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave= new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);

//        Section for Leave Details
        JMenu leavedetails = new JMenu("Leave Details ");
        leavedetails.setFont(new Font("Tahoma",Font.BOLD,16));
        leavedetails .setForeground(Color.CYAN);
        mb.add(leavedetails );

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leavedetails .add(facultyleavedetails);

        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leavedetails .add(studentleavedetails);

//        Section for Exams
        JMenu exams = new JMenu("Examinaton");
        exams.setFont(new Font("Tahoma",Font.BOLD,16));
        exams .setForeground(Color.BLUE);
        mb.add(exams );

        JMenuItem examdetail = new JMenuItem("Examinaton Resuls");
        examdetail.setBackground(Color.WHITE);
        examdetail.addActionListener(this);
        exams .add(examdetail);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exams.add(entermarks);

//        Section for Update Information
        JMenu updateinfo = new JMenu("Update Details");
        updateinfo.setFont(new Font("Tahoma",Font.BOLD,16));
        updateinfo.setForeground(Color.RED);
        mb.add(updateinfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateinfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateinfo.add(updatestudentinfo);

//        Section for Fees
        JMenu fee  = new JMenu("Fee Details");
        fee.setFont(new Font("Tahoma",Font.BOLD,16));
        fee .setForeground(Color.CYAN);
        mb.add(fee );

        JMenuItem feesstructure = new JMenuItem("Fees Structure");
        feesstructure .setBackground(Color.WHITE);
        feesstructure.addActionListener(this);
        fee .add(feesstructure );

        JMenuItem feesform = new JMenuItem("Student Fees Form");
        feesform.setBackground(Color.WHITE);
        feesform.addActionListener(this);
        fee.add(feesform);

//        Section for utility
        JMenu utility  = new JMenu("Utility");
        utility.setFont(new Font("Tahoma",Font.BOLD,16));
        utility.setForeground(Color.BLUE);
        mb.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad );

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setBackground(Color.WHITE);
        calculator.addActionListener(this);
        utility.add(calculator);

//        Section for About
        JMenu about  = new JMenu("About");
        about.setFont(new Font("Tahoma",Font.BOLD,16));
        about.setForeground(Color.RED);
        mb.add(about);

        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

//        Section for exit
        JMenu exit  = new JMenu("Exit");
        exit.setFont(new Font("Tahoma",Font.BOLD,16));
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {

            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {

            }
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetail();
        } else if (msg.equals("View Student Details")) {
            new StudentDetail();
        } else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetail();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetail();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        }else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        }else if (msg.equals("Examinaton Resuls")) {
            new ExaminationDetails();
        }else if (msg.equals("Fees Structure")) {
            new FeesStructure();
        }else if (msg.equals("About")) {
            new About();
        }else if (msg.equals("Student Fees Form")) {
            new StudentFeeForm();
        }
    }

    public static void main(String[] args) {
        new Project();

    }
}

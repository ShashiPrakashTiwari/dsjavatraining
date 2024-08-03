import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String url = "jdbc:mysql://localhost:3306/railwayreservationsystem";
        String user = "root";
        String password = "";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
//            design java UI
            JFrame frame=new JFrame("railwayreservation");
            JLabel titlelable=new JLabel("RAILWAY RESERVATION");
            titlelable.setBounds(470,5,200,50);
            titlelable.setForeground(Color.green);
            frame.add(titlelable);

            JLabel trainname=new JLabel("ENTER TRAIN NAME");
            trainname.setBounds(20,50,120,50);
            trainname.setForeground(Color.red);
            frame.add(trainname);

            JTextField trainnamefield=new JTextField();
            trainnamefield.setBounds(170,60,200,30);
            frame.add(trainnamefield);

            JLabel passengername=new JLabel("ENTER PASSENGER NAME");
            passengername.setBounds(20,100,150,50);
            passengername.setForeground(Color.red);
            frame.add(passengername);

            JTextField passengernamefield=new JTextField();
            passengernamefield.setBounds(170,110,200,30);
            frame.add(passengernamefield);

            JLabel gender=new JLabel("ENTER GENDER");
            gender.setBounds(20,150,100,30);
            gender.setForeground(Color.red);
            frame.add(gender);

            JTextField genderfield=new JTextField();
            genderfield.setBounds(170,150,200,30);
            frame.add(genderfield);

            JLabel startplace=new JLabel("ENTER STARTPLACE NAME");
            startplace.setBounds(15,200,180,30);
            startplace.setForeground(Color.red);
            frame.add(startplace);

            JTextField startplacefield=new JTextField();
            startplacefield.setBounds(170,200,200,30);
            frame.add(startplacefield);

            JLabel endplace=new JLabel("ENTER ENDTPLACE NAME");
            endplace.setBounds(15,250,180,30);
            endplace.setForeground(Color.red);
            frame.add(endplace);

            JTextField endplacefield=new JTextField();
            endplacefield.setBounds(170,250,200,30);
            frame.add(endplacefield);

            JLabel mobileno=new JLabel("ENTER MOBILE NO.");
            mobileno.setBounds(15,300,180,30);
            mobileno.setForeground(Color.red);
            frame.add(mobileno);


            JTextField mobilenofield=new JTextField();
            mobilenofield.setBounds(170,300,200,30);
            frame.add(mobilenofield);

            JLabel age=new JLabel("ENTER AGE");
            age.setBounds(15,350,180,30);
            age.setForeground(Color.red);
            frame.add(age);

            JTextField agefield=new JTextField();
            agefield.setBounds(170,350,200,30);
            frame.add(agefield);

            JButton reseve=new JButton("RESERVE");
            reseve.setBounds(420,550,150,40);
            frame.add(reseve);

            JButton edit=new JButton("EDIT");
            edit.setBounds(300,550,100,40);
            frame.add(edit);

            JButton addmember=new JButton("ADD MEMBER");
            addmember.setBounds(600,550,170,40);
            frame.add(addmember);

            reseve.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String insert="insert into railway(trainname,passengername,gender,startplace,endplace,mobileno,age) value (?,?,?,?,?,?,?)";
                    PreparedStatement ps= null;
                    try {
                        ps = con.prepareStatement(insert);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        ps.setString(1,trainnamefield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        ps.setString(2,passengernamefield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        ps.setString(3,genderfield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        ps.setString(4,startplacefield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        ps.setString(5,endplacefield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        ps.setString(6,mobilenofield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        ps.setString(7,agefield.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
























            frame.setSize(1000,700);
            frame.setLayout(null);
            frame.setVisible(true);





























        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("connected");

    }
}
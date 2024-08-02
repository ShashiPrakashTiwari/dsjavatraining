import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        pass teh database thr url ,username,password in string
        String url="jdbc:mysql://localhost:3306/expensedb";
        String user="root";
        String password="";
        try {
            Connection con= DriverManager.getConnection(url,user,password);
            System.out.println(" DB is connected");
//            to insert data the  into table
            String insert="insert into expense(incomeamount,expensetype,expenseamount) value (?,?,?)";
            PreparedStatement ps=con.prepareStatement(insert);
            ps.setInt(1,100);
            ps.setString(2,"Travel");
            ps.setInt(3,100);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
       }
    }
}
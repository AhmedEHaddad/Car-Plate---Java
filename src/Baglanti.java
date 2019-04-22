
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class Baglanti {
    
      static Connection myConn;
      static  Statement myStat;
    
    static ResultSet yap() {
        ResultSet myRs = null;
        try {
            myConn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/carplate?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
            myStat =(Statement) myConn.createStatement();
            myRs = myStat.executeQuery("select * from cars");
            return myRs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myRs;
    }
    
    static void ekle(String sql_sorgu){
        
        try {
            myStat.executeUpdate(sql_sorgu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    
}

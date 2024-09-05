import java.sql.*;

public class Dao{
        
        
        public void getName(int id){
            try{
                String url="jdbc:mysql://localhost:1129/jafar";
                String name="root";
                String pass="cd4445553";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, name, pass);
                String querry = "select name from students where id="+id;
                Statement st = con.createStatement();
                ResultSet result=st.executeQuery(querry);
                result.next();
                System.out.println(result.getString("name"));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
}

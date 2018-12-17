package util;

public class DataBaseUtil {

    public void initDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class H2Test {
    @Test
    public void testH2Connection() throws SQLException {
//        Connection conn = DriverManager.
//                getConnection("jdbc:h2:~/test", "sa", "");
//        System.out.println(conn);
//        conn.close();


        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:~/test");
        dataSource.setUser("sa");
        Connection conn1 = dataSource.getConnection();


        String creatSql = "CREATE TABLE `member` (\n" +
                "  `id` int(11) NOT NULL DEFAULT '0',\n" +
                "  `username` varchar(10) DEFAULT NULL,\n" +
                "  `password` varchar(10) DEFAULT NULL,\n" +
                "  `nickname` varchar(10) DEFAULT NULL,\n" +
                "  `age` int(11) DEFAULT NULL,\n" +
                "  `addr` varchar(100) DEFAULT NULL\n" +
                ") ";
        conn1.prepareStatement(creatSql).executeQuery();

        PreparedStatement prepareStatement = conn1.prepareStatement("show tables");
        ResultSet resultSet = prepareStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet);
        }
        resultSet.close();
        prepareStatement.close();
        conn1.close();
    }
    @Test
    public void test1(){

    }

}

package behavior.templatemethod.demo2;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public  class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public final List<? > executeQuery(String sql,ObjectMapper <? > map,Object[] values){
        try{
            Connection conn = this.getConnection();
            PreparedStatement pstm = this.createPreparedStatement(conn,sql);
            ResultSet rs = this.executeQuery(pstm,values);
            List<? > result = this.parseResultSet(rs,map);
            rs.close();
            pstm.close();
            conn.close();
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPreparedStatement(Connection conn,String sql) throws SQLException{
        return conn.prepareStatement(sql);
    }

    private ResultSet executeQuery(PreparedStatement pstm,Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private List<? > parseResultSet(ResultSet rs,ObjectMapper<? > map) throws Exception{
        List<Object> result = new ArrayList<Object>();
        int rowNum = 0;
        while (rs.next()){
            result.add(map.mapOjbect(rs));
        }
        return result;
    }

}

package behavior.templatemethod.demo2;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface ObjectMapper<T> {
    T mapOjbect(ResultSet rs) throws SQLException;
}

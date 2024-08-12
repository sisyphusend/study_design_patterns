package behavior.templatemethod.demo2;

import java.sql.ResultSet;
import java.util.List;

public class MemberDaoImp implements MemberDao {

    private JdbcTemplate jdbcTemplate;

    public MemberDaoImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Member> selectAll() {
        List<Member> list = (List<Member>) jdbcTemplate.executeQuery("select * from member_info", (ResultSet rs) -> {
            Member member = new Member();
            member.setId(rs.getInt("id"));
            member.setUsername(rs.getString("id"));
            member.setPassword(rs.getString("password"));
            member.setNickname(rs.getString("nicknmae"));
            member.setAddr(rs.getString("addr"));
            return member;
        },new Object[]{});
        return list;
    }

    public Member selectOneById(int id) {
        return null;
    }

    public void add(Member member) {

    }

    public void update(int id, Member member) {

    }
}

package behavior.templatemethod.demo2;

import java.util.List;

public interface MemberDao {
    public List<Member> selectAll();

    public Member selectOneById(int id);

    public void add(Member member);

    public void update(int id,Member member);
}

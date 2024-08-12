package behavior.templatemethod.demo2;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Member {
    private int id;
    private String username;
    private String password;
    private String nickname;
    private int age;
    private String addr;
}

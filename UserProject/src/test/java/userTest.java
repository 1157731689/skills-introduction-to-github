import org.example.dto.UserDTO;
import org.example.po.User;
import org.example.service.UserService;

/**
 * @Description:
 * @Author: pudding
 * @Date: 2024/1/18 14:11
 * @Version 1.0
 */
public class userTest {
    public static void main(String[] args) {
        User user = new User();
        UserDTO userdto = new UserDTO();
        userdto.setName("mjx");
        userdto.setCode("130203199903265131");
        user = UserService.daoru(userdto);
        System.out.println(user);
    }
}

package org.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dto.UserDTO;
import org.example.mapper.UserMapper;
import org.example.po.User;
import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 * @Description:
 * @Author: pudding
 * @Date: 2024/1/18 14:01
 * @Version 1.0
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    public static User daoru(UserDTO userdto) {
        User user = new User();
        user.setName(userdto.getName());
        user.setCode(userdto.getCode());
        int now = (Calendar.getInstance().get(Calendar.YEAR));
        int birth = Integer.parseInt(userdto.getCode().substring(6, 10));
        user.setAge(String.valueOf(now - birth));
        int flag = Integer.parseInt(userdto.getCode().substring(16, 17));
        if (flag % 2 == 0) {
            user.setSex("女");
        } else {
            user.setSex("男");
        }
        return user;
    }

}

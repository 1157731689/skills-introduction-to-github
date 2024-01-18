package org.example.control;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.dto.UserDTO;
import org.example.mapper.UserMapper;
import org.example.po.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: pudding
 * @Date: 2024/1/18 16:39
 * @Version 1.0
 */
@RestController
public class userControl {

    @Autowired
    private UserMapper userMapper;
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody UserDTO userdto) {
        User user = userService.daoru(userdto);
        userService.save(user);
        return "sucess";
    }

    @PostMapping("/delete")
    public String delete(@RequestBody int id) {
        boolean flag = userService.removeById(id);
        return flag ? "sucess" : "false";
    }

    @PostMapping("/update")
    public String update(@RequestBody UserDTO userDTO) {
        User user = userService.daoru(userDTO);
        List<User> userlist = new ArrayList<>();
        userlist.add(user);


//        int flag = userMapper.update(user, user);
        boolean flag = userService.update((Wrapper<User>) userlist);

        return flag ? "sucess" : "false";
    }

    @PostMapping("/selectById")
    public User selectById(@RequestBody int id) {
        User user = userMapper.selectById(id);

        return user;
    }
}

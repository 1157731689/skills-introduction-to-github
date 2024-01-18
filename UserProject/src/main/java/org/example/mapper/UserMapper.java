package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.po.User;

/**
 * @Description:
 * @Author: pudding
 * @Date: 2024/1/18 16:54
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

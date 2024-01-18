package org.example.dto;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import lombok.Data;
import org.example.po.User;

/**
 * @Description:
 * @Author: pudding
 * @Date: 2024/1/18 13:59
 * @Version 1.0
 */
@Data
public class UserDTO extends Wrapper<User> {
    private String name;
    private String code;


    @Override
    public User getEntity() {
        return null;
    }

    @Override
    public MergeSegments getExpression() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public String getSqlSegment() {
        return null;
    }
}

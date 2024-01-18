package org.example.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Description:
 * @Author: pudding
 * @Date: 2024/1/18 13:56
 * @Version 1.0
 */
@Data
public class User {

    @TableId(type = IdType.ASSIGN_ID)
    private int id;
    private String name;
    private String code;
    private String age;
    private String sex;
}

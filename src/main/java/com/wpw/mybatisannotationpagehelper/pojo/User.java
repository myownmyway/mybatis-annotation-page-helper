package com.wpw.mybatisannotationpagehelper.pojo;

import com.wpw.mybatisannotationpagehelper.vo.RequestVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wpw
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class User extends RequestVo implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String address;

    private String idCard;


}
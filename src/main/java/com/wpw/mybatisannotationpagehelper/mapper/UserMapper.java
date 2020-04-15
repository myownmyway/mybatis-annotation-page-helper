package com.wpw.mybatisannotationpagehelper.mapper;

import com.wpw.mybatisannotationpagehelper.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> listPagination(User user);

    @Results({
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "idCard", column = "id_card"),
            @Result(property = "address", column = "address")
    })
    @SelectProvider(type = UserSqlProvider.class, method = "listPaginationByAnnotation")
    List<User> listPaginationByAnnotation(User user);


    class UserSqlProvider {
        public String listPaginationByAnnotation(@Param("user") User user) {
            SQL sql = new SQL() {
                {
                    SELECT("*");
                    FROM("user");
                    if (user.getUsername() != null && user.getUsername() != "") {
                        WHERE("username like #{username}");
                    }
                    if (user.getPassword() != null && user.getPassword() != "") {
                        WHERE("and password=#{password}");
                    }
                    if (user.getPhone() != null && user.getPhone() != "") {
                        WHERE("and phone=#{phone}");
                    }
                }
            };
            return sql.toString();
        }
    }
}
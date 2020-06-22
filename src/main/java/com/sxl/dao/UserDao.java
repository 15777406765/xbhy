package com.sxl.dao;

import com.sxl.entity.User;
import com.sxl.utils.DBUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    //初始化模板
    private JdbcTemplate jdbcTemplate=new JdbcTemplate(DBUtil.getDataSource());

    //登录查询用户
    public User select(User user){
        String sql="select * from user where username= ? and password =?";
        User user1=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),user.getUsername(),user.getPassword());
        return user1;
    }

    //查询所有用户并显示
    public List<User> list(){
        String sql="SELECT id,username,email,real_name,age,phone,CASE gender WHEN 1 THEN '男' WHEN 0 THEN '女' ELSE '其他' END gender,dept_id,dept_name FROM USER";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));
    }
}

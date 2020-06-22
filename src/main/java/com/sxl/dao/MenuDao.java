package com.sxl.dao;

import com.sxl.entity.Menu;
import com.sxl.utils.DBUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/*
 * @author sxl
 * @description MenuDao
 * @date 2020/6/22
 */
public class MenuDao {

    private JdbcTemplate jdbcTemplate=new JdbcTemplate(DBUtil.getDataSource());

    public List<Menu> list(){
        String sql="select * from menu";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Menu>(Menu.class));
    }
}

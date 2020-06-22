package com.sxl.service;

import com.sxl.dao.MenuDao;
import com.sxl.entity.Menu;

import java.util.List;

/*
 * @author sxl
 * @description MenuService
 * @date 2020/6/22
 */
public class MenuService {
    MenuDao menuDao=new MenuDao();

    public List<Menu> list(){
        return menuDao.list();
    }
}

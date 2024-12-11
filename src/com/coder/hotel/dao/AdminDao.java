package com.coder.hotel.dao;

import com.coder.hotel.entity.Admin;

import java.util.List;

/**
 * @author ZQC
 * @date 2024-11-29
 * @project HotelManager
 */
public interface AdminDao {
    int save(Admin admin);
    int delete(Object id);
    int update (Admin admin);
    Admin login(String name,String pwd);
    List<Admin> selectList();
    List<Admin> selectByName(String name);



}

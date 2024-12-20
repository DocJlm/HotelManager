package com.coder.hotel.service;

import com.coder.hotel.dao.RoomTypeDao;
import com.coder.hotel.dao.impl.RoomTypeDaoImpl;
import com.coder.hotel.entity.RoomType;

import java.util.List;


/**
 * @author ZQC
 * @date 2024-12-04
 * @project HotelManager
 */
public class RoomTypeService {
    private static RoomTypeDao dao;
    static {
        dao=new RoomTypeDaoImpl();
    }

    public int save(RoomType type){
        return dao.save(type);
    }

    public Object[][] selectList(){
        return dao.listToArray(dao.selectList());
    }
    public int deleteId(Object id){
        return dao.delete(id);
    }
    public Object[][] selectByType(String type){
        List<RoomType> list = dao.selectByType(type);
        return dao.listToArray(list);

    }
    public RoomType selectId(Object id){
        return dao.selectId(id);
    }
    public int update(RoomType type){
        return dao.update(type);
    }
}


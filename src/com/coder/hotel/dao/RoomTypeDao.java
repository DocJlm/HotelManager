package com.coder.hotel.dao;

import com.coder.hotel.entity.RoomType;

import java.util.List;

/**
 * @author ZQC
 * @date 2024-12-04
 * @project HotelManager
 */
public interface RoomTypeDao {
    int save(RoomType type);
    int update(RoomType type);
    int delete(Object id);
    RoomType selectId(Object id);
    List<RoomType>  selectList();
    List<RoomType> selectByType(String type);


    RoomType selectType(String type);
    Object[][] listToArray(List<RoomType> list);
}

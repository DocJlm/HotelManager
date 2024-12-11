package com.coder.hotel.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author ZQC
 * @date 2024-11-29
 * @project HotelManager
 */
public class Admin {
    private Integer id;
    private String name;
    private String pwd;
    private LocalDateTime lasttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public LocalDateTime getLasttime() {
        return lasttime;
    }

    public void setLasttime(LocalDateTime lasttime) {
        this.lasttime = lasttime;
    }
}

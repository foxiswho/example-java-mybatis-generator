package com.foxwho.pojo;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    private Integer uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 添加时间
     */
    @Column(name = "time_add")
    private Date timeAdd;

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取添加时间
     *
     * @return time_add - 添加时间
     */
    public Date getTimeAdd() {
        return timeAdd;
    }

    /**
     * 设置添加时间
     *
     * @param timeAdd 添加时间
     */
    public void setTimeAdd(Date timeAdd) {
        this.timeAdd = timeAdd;
    }
}
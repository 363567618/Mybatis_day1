package com.mclx.Dao;

import com.mclx.domain.user;

import java.util.List;

//用户的持久层接口
public interface IUserDao {
    /**
     * 查询所有
     * @return
     */
    List<user>findall();
}

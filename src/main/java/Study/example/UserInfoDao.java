package org.example;

import java.util.List;

public interface UserInfoDao {
    //    查询所有信息
    public List<UserInfo> findAllUser();
    //    查询某个部门信息
    public UserInfo findUserById(int id);

}


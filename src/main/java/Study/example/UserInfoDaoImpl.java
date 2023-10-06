package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//查询所有部门信息
public class UserInfoDaoImpl implements UserInfoDao {
    @Override
    public List<UserInfo> findAllUser() {
        List<UserInfo> lists = new ArrayList<UserInfo>();
//        获取数据库连接对象
        Connection conn = DBHelper.getConn();
//        书写SQL语句操作数据库
        String sql = "select *from dept";
//        预编译sql语句
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
//            查询
            ResultSet rs = ps.executeQuery();
//            循环输出
            while (rs.next()) {//有数据则返回ture
                UserInfo ui = new UserInfo();
                ui.setDepno(rs.getInt(1));
                ui.setDname(rs.getString(2));
                ui.setLoc(rs.getString(3));
                lists.add(ui);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists;
    }
    //查询某个部门的类
    @Override
    public UserInfo findUserById(int no) {
//        获取数据库连接对象
        UserInfo ui = null;
        Connection conn = DBHelper.getConn();
//        书写SQL语句操作数据库
        String sql = "select *from dept where depno=?";
//        预编译sql语句
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
//                赋值
            ps.setInt(1,no);
//            查询
            ResultSet rs = ps.executeQuery();
//            循环输出
            while (rs.next()) {//有数据则返回ture
                ui = new UserInfo();
                ui.setDepno(rs.getInt(1));
                ui.setDname(rs.getString(2));
                ui.setLoc(rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ui;
    }
}

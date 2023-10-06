package org.example;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //查询输出所有信息
        UserInfoDao depno = new UserInfoDaoImpl();
        List<UserInfo> list = depno.findAllUser();
        for (UserInfo u : list) {
            System.out.println(u.getDepno()+"\t"+u.getDname()+"\t"+u.getLoc());
        }
//查询部门号为20的数据
        UserInfo ui = depno.findUserById(20);
        if (ui!=null){
            System.out.println("找到部门信息");
            System.out.println(ui.getDepno()+"\t"+ui.getDname()+"\t"+ui.getLoc());
        }else{
            System.out.println("没有这个部门");
        }
    }
}


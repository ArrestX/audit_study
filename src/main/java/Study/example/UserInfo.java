package org.example;

public class UserInfo  {
    private int depno;
    private String dname;
    private String loc;

    public int getDepno() {
        return depno;
    }

    public void setDepno(int depno) {
        this.depno = depno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    public UserInfo(int depno, String dname, String loc) {
        super();
        this.depno = depno;
        this.dname = dname;
        this.loc = loc;
    }

    public UserInfo() {
        super();
    }

}


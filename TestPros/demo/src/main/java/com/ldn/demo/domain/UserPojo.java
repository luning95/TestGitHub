package com.ldn.demo.domain;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user")
public class UserPojo {
    @Id
    @GeneratedValue
    private Integer uid;
    @Column(nullable = false)
    private String uname;
    @Column(nullable = false)
    private Integer uage;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;

    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public boolean isUsex() {
        return usex;
    }

    public void setUsex(boolean usex) {
        this.usex = usex;
    }

    @Column(nullable = false)
    private boolean usex;
}

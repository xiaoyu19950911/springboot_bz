package com.springboot.requestbean;

/**
 * @Author:xiaoyu
 * @Descripstion:
 * @Date:Created in 2018/1/2 11:22
 * @Modified By:
 */
public class RequestUserBean {

    private Integer id;

    private  String name;

    private  String sex;

    private  String address;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package com.fengchao.pma.entity;

public class User {
    /** 用户信息Id 主键 */
    private  Integer id;

    /** 用户姓名 主键 */
    private String name;

    /** 用户年龄 主键 */
    private Integer age;

    /** 用户年龄  0-Male   1-Female 主键 */
    private String gender;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

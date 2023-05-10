package com.zhuyaning.game_mall.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: ZhuYaning
 * Date: 2022/02/23
 * Time: 18:01
 */

@Entity
@Table(name = "sys_user")
public class User {

    @Id
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "varchar(30)")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "email")
    private String email;

    @Column(name = "version")
    private Integer version;

    @Column(name = "deleted")
    private Integer deleted;

    @Column(name = "gmt_create")
    private LocalDateTime gmtCreate;

    @Column(name = "gmt_modifie")
    private LocalDateTime gmtModifie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModifie() {
        return gmtModifie;
    }

    public void setGmtModifie(LocalDateTime gmtModifie) {
        this.gmtModifie = gmtModifie;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", version=" + version +
                ", deleted=" + deleted +
                ", gmtCreate=" + gmtCreate +
                ", gmtModifie=" + gmtModifie +
                '}';
    }
}

package me.deqiang.demo.jpa.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Howrd
 * Date: 13-11-15
 * Time: 下午6:28
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="t_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

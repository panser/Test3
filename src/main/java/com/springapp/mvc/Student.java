package com.springapp.mvc;

import javax.persistence.*;

/**
 * Created by angel on 29.03.14.
 */

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name ="password")
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

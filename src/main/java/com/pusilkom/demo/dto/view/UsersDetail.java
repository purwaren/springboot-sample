package com.pusilkom.demo.dto.view;

import com.pusilkom.demo.model.Users;

public class UsersDetail {
    private Long id;
    private Long institusiId;
    private String username;
    private String password;
    private String role;

    public UsersDetail() {}

    public UsersDetail(Users user) {
        this.id = user.getId();
        this.institusiId = user.getInstitusiId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.role = user.getRole();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInstitusiId() {
        return institusiId;
    }

    public void setInstitusiId(Long institusiId) {
        this.institusiId = institusiId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

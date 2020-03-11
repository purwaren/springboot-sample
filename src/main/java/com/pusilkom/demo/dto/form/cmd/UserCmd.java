package com.pusilkom.demo.dto.form.cmd;

import com.pusilkom.demo.model.User;

public class UserCmd {
    private Long id;
    private String username;
    private String password;
    private Long idInstitusi;
    private String role;

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

    public Long getIdInstitusi() {
        return idInstitusi;
    }

    public void setIdInstitusi(Long idInstitusi) {
        this.idInstitusi = idInstitusi;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User toUser(){
        User user = new User();
        user.setId(this.id);
        user.setUsername(this.username);
        user.setPassword(this.password);
        user.setIdInstitusi(this.idInstitusi);
        user.setRole(this.role);

        return user;
    }
}

package com.pusilkom.demo.dto.table;

public class UsersItem {
    private Long id;
    private Long institusiId;
    private String username;
    private String password;
    private String role;

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

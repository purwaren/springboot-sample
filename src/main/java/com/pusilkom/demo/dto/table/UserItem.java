package com.pusilkom.demo.dto.table;

public class UserItem {
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
}

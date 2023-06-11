package ru.suvorov.models;

import lombok.Data;

@Data
public class UserTokenInfo {
    private String id;
    private String username;

    public UserTokenInfo(String info) {
        String[] strs = info.split(" ");
        this.id = strs[1];
        this.username = strs[0];
    }
}

package com.pojo;

public class UserLogin {
    private int loginId;
    private int userId;
    private String loginName;
    private String loginPass;

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public UserLogin(int loginId, int userId, String loginName, String loginPass) {
        this.loginId = loginId;
        this.userId = userId;
        this.loginName = loginName;
        this.loginPass = loginPass;
    }

    public UserLogin() {
        super();
    }
}

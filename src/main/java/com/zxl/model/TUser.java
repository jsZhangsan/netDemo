package com.zxl.model;

public class TUser {
    private String id;

    private String userName;

    private String passWord;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

	@Override
	public String toString() {
		return "TUser [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
    
}
package com.ioc.coupling;

public class UserManager {
    // 1. 成員變數型別改為 UserDataProvider
    private UserDataProvider userDataProvider;

    // 2. 建構子接收的型別改為 UserDataProvider
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return userDataProvider.getUserDetails(); // 或呼叫介面定義的方法
    }
}
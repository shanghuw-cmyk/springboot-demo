package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args){
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

         UserDataProvider webServiceProvider = new webServiceDataProvider();
         UserManager userManagerWithWs = new UserManager(webServiceProvider);
         System.out.println(userManagerWithWs.getUserInfo());

        UserDataProvider newServiceProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDB = new UserManager(newServiceProvider);
        System.out.println(userManagerWithDB.getUserInfo());


    }
}

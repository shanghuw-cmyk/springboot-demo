package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args){


        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationloCLooseCouplingExample.xml");


   //     UserDataProvider databaseProvider = new UserDatabaseProvider();
  //      UserManager userManagerWithDB = new UserManager(databaseProvider);
        UserManager  userManagerWithDB = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithDB.getUserInfo());

         UserDataProvider webServiceProvider = new WebServiceProvider();
         UserManager userManagerWithWs = new UserManager(webServiceProvider);
         System.out.println(userManagerWithWs.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());


    }
}

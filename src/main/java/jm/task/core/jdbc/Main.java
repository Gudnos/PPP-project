package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

//        Util util = new Util();
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.createUsersTable();
//
//        userService.saveUser("Ivan", "Petrov", (byte) 35);
//        userService.saveUser("Nikolay", "Sidorov", (byte) 41);
//        userService.saveUser("Petr", "Ivanov", (byte) 28);
//        userService.saveUser("Sergey", "Smirnov", (byte) 56);
//
//        userService.getAllUsers();
//
//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();


        UserDaoHibernateImpl us = new UserDaoHibernateImpl();

        us.createUsersTable();

        us.saveUser("Ivan", "Petrov", (byte)35);
        us.saveUser("Nikolay", "Sidorov", (byte) 41);
        us.saveUser("Petr", "Ivanov", (byte) 28);
        us.saveUser("Sergey", "Smirnov", (byte) 56);

        us.getAllUsers();

        us.cleanUsersTable();

        us.dropUsersTable();

        Util.closeSessionFactory();

    }
}

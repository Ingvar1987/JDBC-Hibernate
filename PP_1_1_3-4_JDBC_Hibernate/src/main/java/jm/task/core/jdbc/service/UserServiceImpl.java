package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserDao userDaoJDBCImpl = new UserDaoJDBCImpl();

    public UserDao getUserDaoJDBCImpl() {
        return userDaoJDBCImpl;
    }

    @Override
    public void createUsersTable() {
        userDaoJDBCImpl.createUsersTable();

    }

    @Override
    public void dropUsersTable() {
        userDaoJDBCImpl.dropUsersTable();

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBCImpl.saveUser(name, lastName, age);

    }

    @Override
    public void removeUserById(long id) {
        userDaoJDBCImpl.removeUserById(id);

    }

    @Override
    public List<User> getAllUsers() {

        return userDaoJDBCImpl.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userDaoJDBCImpl.cleanUsersTable();
    }
}
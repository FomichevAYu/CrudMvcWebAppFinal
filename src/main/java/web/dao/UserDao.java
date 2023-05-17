package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> showAllUsers();

    User showUser(int id);

    void createUser(User user);

    void updateUser(User user, int id);

    void deleteUser(int id);
}
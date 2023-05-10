package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public void addUser();
    public void updateUser();
    public void removeUser();
}

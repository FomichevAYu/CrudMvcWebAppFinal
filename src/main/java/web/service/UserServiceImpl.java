package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void update(User user, int id) {
        userDao.update(user, id);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}

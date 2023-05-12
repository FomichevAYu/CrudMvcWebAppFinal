package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl {
    private List<User> listUser;
    {   listUser = new ArrayList<>();
        listUser.add(new User(1, "name1", "lastname1"));
        listUser.add(new User(2, "name2", "lastname2"));
        listUser.add(new User(3, "name3", "lastname3"));
    }
    public List<User>index(){
        return listUser;
    }
    public User show(int id){
        return listUser.stream().filter(user -> user.getId()==id).findAny().orElse(null);
    }
    public void addUser(User user){
        listUser.add(user);
    }
    public void update(User user, int id){
        User updateUser = show(id);
        updateUser.setId(user.getId());
        updateUser.setName(user.getName());
        updateUser.setLastName(user.getLastName());
    }
}

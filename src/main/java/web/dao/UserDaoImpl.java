package web.dao;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Transactional

    public List<User> index() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    public void addUser(User user) {
        entityManager.persist(user);
    }

    public void update(User user, int id) {
        User updateUser = show(id);
        updateUser.setId(user.getId());
        updateUser.setName(user.getName());
        updateUser.setLastName(user.getLastName());
        entityManager.merge(updateUser);
    }

    public void delete(int id) {
        entityManager.remove(show(id));
    }
}

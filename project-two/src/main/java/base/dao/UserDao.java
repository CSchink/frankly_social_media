package base.dao;

import base.model.User;

import java.util.List;

public interface UserDao {

        public void createUser(User user);

        public User login(String email, String password);

        public User getUserByEmail(String email);

        public boolean updateUser(User user);

        public List<User> getAllUsersLoggedIn();

        public List<User> getAllUsers();

        public User getUserByFullName(String firstName, String lastName);

        User getUserById(int id);
}

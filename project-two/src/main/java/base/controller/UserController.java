package base.controller;


import base.dao.UserDao;
import base.dao.UserDaoImpl;

import base.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private UserDaoImpl userDao;
    SessionController sesCont;

    //http://localhost:9005/social/api/getUserById/
    //changed to GET for testing purposes
    @CrossOrigin(allowCredentials = "true")
    @GetMapping(value="/getUserById", params={"id"}, produces="application/json")
    public @ResponseBody
    ResponseEntity<User> getUserById(int id, HttpSession session){
        User user;
        System.out.println("in the get user by id method");
        System.out.println(id);

        user = userDao.getUserById(id);

//        session.setAttribute("loggedin", user);
////        System.out.println(session.getAttribute("loggedin"));
        sesCont = new SessionController();
        sesCont.setUserSession(session, user);

        System.out.println(session.getAttribute("loggedin"));

        return new ResponseEntity<User>(user,
                HttpStatus.OK);
    }



    @PostMapping(value="/createUser")
    public String createNewFood(@RequestBody User newUser){
        userDao.createUser(newUser);
        return "success";
    }



    ////Constructors

    public UserController(){
        insertInitialValues();
    }

    ///Autowired constructor to inject the repo directly

    @Autowired
    public UserController(UserDaoImpl userDao){

        this.userDao = userDao;
        insertInitialValues();
    }

    ////Getters and Setters

    public UserDao getUserDao() {
        insertInitialValues();
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDaoImpl userDao) {
        insertInitialValues();
        this.userDao = userDao;
    }

    /**
     * Insert initial values for testing purposes
     */

    public void insertInitialValues(){

        User dan = new User("Frank", "LeHioya", "frank@email.com", "12356", "Mikey", "WOW.jpeg");
        User dan2 = new User("Ben", "Big", "Big@email.com", "12356", "Destroyer", "face.jpeg");
        User dan3 = new User("John", "Big", "Big@email.com", "12356", "Destroyer", "face.jpeg");

        userDao.createUser(dan);
        userDao.createUser(dan2);
        userDao.createUser(dan3);
    }
}

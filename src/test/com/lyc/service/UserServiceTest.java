package com.lyc.service;

import com.lyc.model.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class UserServiceTest extends TestCase {
    @Autowired
    private UserService userService;
    @Test
    public void testAddUser() throws Exception {
        User user = new User();
        user.setName("小明");
        userService.addUser(user);

    }

}
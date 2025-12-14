package com.sweetshop.sweetshop.user.service;

import com.sweetshop.sweetshop.user.User;
import com.sweetshop.sweetshop.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    void shouldRegisterUserSuccessfully() {
        User user = new User();
        user.setUsername("testuser");
        user.setEmail("test@example.com");
        user.setPassword("password123");

        User savedUser = userService.registerUser(user);

        assertNotNull(savedUser.getId());
        assertNotEquals("password123", savedUser.getPassword());
        assertEquals("USER", savedUser.getRole());
    }
}

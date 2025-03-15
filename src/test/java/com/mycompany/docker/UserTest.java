package com.mycompany.docker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit4 test class for User.
 */
public class UserTest {
    private User user;

    @Before
    public void setUp() {
        user = new User("123", "test@example.com"); // Giả định constructor User(userId, email)
    }

    @After
    public void tearDown() {
        user = null;
    }

    @Test
    public void testGetEmail() {
        assertEquals("test@example.com", user.getEmail());
    }

    @Test
    public void testSetEmail() {
        user.setEmail("new@example.com");
        assertEquals("new@example.com", user.getEmail());
    }

    @Test
    public void testUpdateEmail() {
        user.updateEmail("update@example.com");
        assertEquals("update@example.com", user.getEmail());
    }

    @Test
    public void testGetUserId() {
        assertEquals("123", user.getUserId());
    }
}
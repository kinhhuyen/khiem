import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    // Test tạo đối tượng User và kiểm tra getter
    @Test
    public void testUserCreation() {
        User user = new User("user123", "user@example.com");
        assertEquals("user123", user.getUserId());
        assertEquals("user@example.com", user.getEmail());
    }

    // Test phương thức setEmail
    @Test
    public void testSetEmail() {
        User user = new User("user123", "old@example.com");
        user.setEmail("new@example.com");
        assertEquals("new@example.com", user.getEmail());
    }

    // Test phương thức updateEmail
    @Test
    public void testUpdateEmail() {
        User user = new User("user123", "old@example.com");
        user.updateEmail("updated@example.com");
        assertEquals("updated@example.com", user.getEmail());
    }
}

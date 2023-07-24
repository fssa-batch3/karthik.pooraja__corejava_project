package day10.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserAlreadyExistsExceptionTestCase{

    @Test
    public void testRegisterNewUser() {
        User user = new User(1, "John", "john@example.com");
        boolean result = UserValidator.register(user);
        assertTrue(result);
    }
    @Test
    public void testRegisterNullUser() {
        User user = null;
        
        // Attempt to register a null user (should catch UserAlreadyExistsException)
        try {
            boolean result = UserValidator.register(user);
            fail("Expected UserAlreadyExistsException to be thrown, but it was not.");
        } catch (UserAlreadyExistsException e) {
            // Exception caught successfully, as expected.
            assertEquals("object cannot null", e.getMessage());
        }
    }
}

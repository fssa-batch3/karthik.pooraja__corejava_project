package day10.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class EmailValidatorTest {

    @Test
    public void testValidEmail() {
        String validEmail = "test@example.com";
        try {
            boolean result = EmailExceptionDemo.isValidEmail(validEmail);
            Assertions.assertTrue(result);
        } catch (InvalidEmailException e) {
            Assertions.fail("Valid email should not throw an exception.");
        }
    }

    @Test
    public void testInvalidEmail() {
        String invalidEmail = "invalid_email.com";
        try {
            boolean result = EmailExceptionDemo.isValidEmail(invalidEmail);
            Assertions.fail("Invalid email should throw an InvalidEmailException.");
        } catch (InvalidEmailException e) {
            Assertions.assertEquals("The email is invalid", e.getMessage());
        }
    }

    @Test
    public void testNullEmail() {
        String nullEmail = null;
        try {
            boolean result = EmailExceptionDemo.isValidEmail(nullEmail);
            Assertions.fail("Null email should throw an InvalidEmailException.");
        } catch (InvalidEmailException e) {
            Assertions.assertEquals("The email cannot be null", e.getMessage());
        }
    }
}


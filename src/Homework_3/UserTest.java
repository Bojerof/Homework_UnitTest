package Homework_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private User user2;
    @BeforeEach
    void setUp() {
        user = new User("Jon", "qwer");
        user2 = new User("Sam", "weds");
    }
    @Test
    void checkTrueLogin(){
        assertThat(user.checkUser()).isTrue();
    }
    @Test
    void checkFalseLogin(){
        assertThat(user2.checkUser()).isFalse();
    }
}
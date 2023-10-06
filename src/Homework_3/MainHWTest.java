package Homework_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    private MainHW main;
    @BeforeEach
    void setUp(){
        main = new MainHW();
    }
    @Test
    void evenNumber(){
        assertThat(main.evenOddNumber(2)).isTrue();
    }
    @Test
    void oddNumber(){
        assertThat(main.evenOddNumber(3)).isFalse();
    }
    @Test
    void falseInterval(){
        assertThat(main.numberInterval(2)).isFalse();
    }
    @Test
    void trueInterval(){
        assertThat(main.numberInterval(25)).isTrue();
    }
}
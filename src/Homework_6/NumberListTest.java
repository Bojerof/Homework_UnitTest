package Homework_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {
    private NumberList numberList;

    @BeforeEach
    void setUp() {
        numberList = new NumberList();
    }

    @Test
    void createList() {
        List<Integer> resultList = numberList.createList(4);
        assertThat(numberList.createList(4).size()).isEqualTo(resultList.size());
    }

    @Test
    void compareListMore() {
        assertThat(numberList.compareList(new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5)),
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)))).isEqualTo("Первый список больше второго");
    }

    @Test
    void compareListLess() {
        assertThat(numberList.compareList(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)),
                new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5)))).isEqualTo("Второй список больше первого");
    }

    @Test
    void compareListEqual() {
        assertThat(numberList.compareList(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)),
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)))).isEqualTo("Они равны");
    }
    @Test
    void compareListNull(){
        assertEquals(numberList.compareList(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)),
                null), "Список пуст");
    }
}
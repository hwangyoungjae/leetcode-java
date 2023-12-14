package org.example.p0058_LengthOfLastWord;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        int actual = solution.lengthOfLastWord("Hello World");
        assertThat(actual).isEqualTo(5);
    }

    @Test
    void example2() {
        int actual = solution.lengthOfLastWord("   fly me   to   the moon  ");
        assertThat(actual).isEqualTo(4);
    }

    @Test
    void example3() {
        int actual = solution.lengthOfLastWord("luffy is still joyboy");
        assertThat(actual).isEqualTo(6);
    }

    @Test
    void example4() {
        int actual = solution.lengthOfLastWord("Today is a nice day ");
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void example5() {
        int actual = solution.lengthOfLastWord("a ");
        assertThat(actual).isEqualTo(1);
    }
}
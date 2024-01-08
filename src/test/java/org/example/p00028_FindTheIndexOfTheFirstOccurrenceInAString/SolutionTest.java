package org.example.p00028_FindTheIndexOfTheFirstOccurrenceInAString;

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
    void example0() {
        int actual = solution.strStr("hyja", "yj");
        assertThat(actual).isEqualTo(1);
    }
    @Test
    void example1() {
        int actual = solution.strStr("sadbutsad", "sad");
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void example2() {
        int actual = solution.strStr("leetcode", "leeto");
        assertThat(actual).isEqualTo(-1);
    }

    @Test
    void example3() {
        int actual = solution.strStr("aaa", "aaaa");
        assertThat(actual).isEqualTo(-1);
    }

    @Test
    void example4() {
        int actual = solution.strStr("mississippi", "issipi");
        assertThat(actual).isEqualTo(-1);
    }
}
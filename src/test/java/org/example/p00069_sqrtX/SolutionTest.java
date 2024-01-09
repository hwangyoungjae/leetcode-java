package org.example.p00069_sqrtX;

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
        int actual = solution.mySqrt(0);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void example1() {
        int actual = solution.mySqrt(27);
        assertThat(actual).isEqualTo(5);
    }

    @Test
    void example2() {
        int actual = solution.mySqrt(8);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void example3() {
        int actual = solution.mySqrt(1024);
        assertThat(actual).isEqualTo(32);
    }

    @Test
    void example4() {
        int actual = solution.mySqrt(2147395599);
        assertThat(actual).isEqualTo(46339);
    }

    @Test
    void example5() {
        int actual = solution.mySqrt(2147395600);
        assertThat(actual).isEqualTo(46340);
    }

    @Test
    void example6() {
        int actual = solution.mySqrt(2147483647);
        assertThat(actual).isEqualTo(46340);
    }
}
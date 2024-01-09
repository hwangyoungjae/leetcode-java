package org.example.p00070_ClimbingStairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1:1",
            "2:2",
            "3:3",
            "4:5",
            "5:8",
            "6:13",
            "7:21",
            "45:1836311903",
    }, delimiter = ':')
    void example(int n, int expected) {
        assertThat(solution.climbStairs(n)).isEqualTo(expected);
    }
}
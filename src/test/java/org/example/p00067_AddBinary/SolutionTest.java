package org.example.p00067_AddBinary;

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
    void example_1() {
        String actual = solution.addBinary("10110", "1101");
        assertThat(actual).isEqualTo("100011");
    }
    @Test
    void example0() {
        String actual = solution.addBinary("110", "11");
        assertThat(actual).isEqualTo("1001");
    }

    @Test
    void example1() {
        String actual = solution.addBinary("11", "1");
        assertThat(actual).isEqualTo("100");
    }

    @Test
    void example2() {
        String actual = solution.addBinary("1010", "1011");
        assertThat(actual).isEqualTo("10101");
    }

    @Test
    void example3() {
        String actual = solution.addBinary("0", "0");
        assertThat(actual).isEqualTo("0");
    }

    @Test
    void example4() {
        String actual = solution.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        assertThat(actual).isEqualTo("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000");
    }
}
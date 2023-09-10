package de.turing85.openrewrite.example;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class BarTest {
  @Test
  void shouldReturnExpected() {
    // GIVEN
    final int input = 10;
    final int expected = input + 1;

    // WHEN
    final int actual = ((Foo) new Bar()).foo(input);

    // THEN
    assertThat(actual).isEqualTo(expected);
  }
}

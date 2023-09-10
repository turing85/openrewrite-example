package de.turing85.openrewrite.example;

import java.io.IOException;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class BarTest {
  private static final Random RANDOM = new Random();

  @Test
  void shouldReturnExpected() throws IOException {
    // GIVEN
    final int input = 10;
    final int expected = input + 1;

    // WHEN
    final int actual = ((Foo) new Bar()).foo(input);

    // THEN
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void shouldReturnExpectedWithRandom() {
    // GIVEN
    final int input = RANDOM.nextInt();
    final int expected = input + 1;

    // WHEN
    final int actual = ((Foo) new Bar()).foo(input);

    // THEN
    assertThat(actual).isEqualTo(expected);
  }
}

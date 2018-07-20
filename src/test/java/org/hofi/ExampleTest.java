package org.hofi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ExampleTest {

  @Test
  void testMyFunction() {
    Example example = new Example();
    assertEquals("Hello World 12345", example.myFunction());
  }

  @Test
  void testMyFunction_withMockito() {

    Example example = new Example();
    example.api = () -> {
      MyApi myApi = mock(MyApi.class);
      when(myApi.greetings()).thenReturn("My Mock");
      return myApi;
    };

    assertEquals("My Mock 12345", example.myFunction());
  }
}



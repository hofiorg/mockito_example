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
    Example example = new Example() {
      @Override
      Api getApi() {
        Api api = mock(Api.class);
        when(api.getGreetings()).thenReturn("My Mock");
        return api;
      }
    };

    assertEquals("My Mock 12345", example.myFunction());
  }
}



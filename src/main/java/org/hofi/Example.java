package org.hofi;

class Example {
  Api api = MyApi::new;

  String myFunction() {
    return api.getMyAPI().greetings() + " 12345";
  }
}

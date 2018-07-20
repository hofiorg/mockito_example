package org.hofi;

class Example {

  String myFunction() {
    return getApi().getGreetings() + " 12345";
  }

  Api getApi() {
    return new Api();
  }
}

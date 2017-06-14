package hello;

import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Say something, please.");
    Scanner sc = new Scanner(System.in);
    String in = sc.next();
    System.out.println("You said: \"" + in + "\"");

    System.out.println("A random number is: " + Math.random());

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}


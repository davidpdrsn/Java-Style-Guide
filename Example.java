/**
 * Some high level comment describing what the person class does.
 */
class Person {
  private static String property;

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /**
   * Greet people
   */
  public void greet() {
    System.out.println(this.buildGreenting());
  }

  public String buildGreenting() {
    return "Hi my name is " + this.name;
  }

  public int getAge() {
    return this.age;
  }

  private static staticPrivateMethod() {
    // ...
  }

  private int staticInstanceMethod() {
    // ...
  }
}

public class SomeMainClass {
  public static void main(String[] args) {
    Person aPerson = new Person("Bob", 25);
    Person anotherPerson = new Person("Alice", 55);

    aPerson.greet();

    System.out.println(anotherPerson.buildGreenting());

    if (aPerson.getAge() > 40) {
      System.out.println(aPerson + " is kinda old");
    } else {
      System.out.println(aPerson + " is not old");
    }
  }
}

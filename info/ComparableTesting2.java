/* Integrating Comparators in Comparable Classes

The previous example with the Comparator interface works fine. However, the drawback is that it requires multiple classes. 
This means more maintenance work for the users of your comparable class. 
The next example shows how to integrate the comparators inside of the comparable class by making the comparators anonymous classes.

This example has two classes: comparable.ex03.Person (Listing 10) and comparable.ex03.Testing (Listing 11). 
Note the two anonymous inner classes at the end of the Person class, and notice also in the Testing class how comparison is conducted.
*/

package comparable.ex03;

import java.util.Comparator;

public class Person implements Comparable {
  private String firstName;
  private String lastName;
  private int age;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int compareTo(Object anotherPerson) throws ClassCastException {
    if (!(anotherPerson instanceof Person))
      throw new ClassCastException("A Person object expected.");
    int anotherPersonAge = ((Person) anotherPerson).getAge();  
    return this.age - anotherPersonAge;    
  }

  public static Comparator LastNameComparator = new Comparator() {
    public int compare(Object person, Object anotherPerson) {
      String lastName1 = ((Person) person).getLastName().toUpperCase();
      String firstName1 = ((Person) person).getFirstName().toUpperCase();
      String lastName2 = ((Person) anotherPerson).getLastName().toUpperCase();
      String firstName2 = ((Person) anotherPerson).getFirstName().toUpperCase();

      if (!(lastName1.equals(lastName2)))
        return lastName1.compareTo(lastName2);
      else
        return firstName1.compareTo(firstName2);
    }
  };

  public static Comparator FirstNameComparator = new Comparator() {
    public int compare(Object person, Object anotherPerson) {
      String lastName1 = ((Person) person).getLastName().toUpperCase();
      String firstName1 = ((Person) person).getFirstName().toUpperCase();
      String lastName2 = ((Person) anotherPerson).getLastName().toUpperCase();
      String firstName2 = ((Person) anotherPerson).getFirstName().toUpperCase();

      if (!(firstName1.equals(firstName2)))
        return firstName1.compareTo(firstName2);
      else
        return lastName1.compareTo(lastName2);
    }
  };
}
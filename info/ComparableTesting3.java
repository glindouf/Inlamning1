/*
The result of the Testing class is the same as the previous example. 
However, note that the comparators are inside of the Person class. 
To sort instances of the Person class by last name, you just need to use:

Arrays.sort(persons, Person.LastNameComparator);
To sort them by first name:

Arrays.sort(persons, Person.LastNameComparator);
Summary

This article has demonstrated how to make class instances comparable and sortable. 
Example 1 shows that implementing the compareTo method of the java.lang.Comparable interface is the easiest solution. 
To compare instances in multiple ways, create comparators by implementing the java.util.Comparator class, as demonstrated in Example 2. 
For better maintenance, you can embed the comparators as anonymous classes in your comparable class, as shown in Example 3.
*/

package comparable.ex03;

import java.util.Arrays;
import java.util.ArrayList;

public class Testing {

  public static void main(String[] args) {
    Person[] persons = new Person[4];
    persons[0] = new Person();
    persons[0].setFirstName("Elvis");
    persons[0].setLastName("Goodyear");
    persons[0].setAge(56);

    persons[1] = new Person();
    persons[1].setFirstName("Stanley");
    persons[1].setLastName("Clark");
    persons[1].setAge(8);

    persons[2] = new Person();
    persons[2].setFirstName("Jane");
    persons[2].setLastName("Graff");
    persons[2].setAge(16);

    persons[3] = new Person();
    persons[3].setFirstName("Nancy");
    persons[3].setLastName("Goodyear");
    persons[3].setAge(69);

    System.out.println("Natural Order");

    for (int i=0; i<4; i++) {
      Person person = persons[i];
      String lastName = person.getLastName();
      String firstName = person.getFirstName();
      int age = person.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(persons, Person.LastNameComparator);
    System.out.println();
    System.out.println("Sorted by last name");

    for (int i=0; i<4; i++) {
      Person person = persons[i];
      String lastName = person.getLastName();
      String firstName = person.getFirstName();
      int age = person.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(persons, Person.FirstNameComparator);
    System.out.println();
    System.out.println("Sorted by first name");

    for (int i=0; i<4; i++) {
      Person person = persons[i];
      String lastName = person.getLastName();
      String firstName = person.getFirstName();
      int age = person.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(persons);
    System.out.println();
    System.out.println("Sorted by age");

    for (int i=0; i<4; i++) {
      Person person = persons[i];
      String lastName = person.getLastName();
      String firstName = person.getFirstName();
      int age = person.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }
  }
}